package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.*;

/**
 * @author isaquehg
 * @since 4/12
 * @version 1.0
 * Publisher class for Sensor
 */
public class SensorPublisher {
    public static void main(String[] args) throws Exception {
        // Criar o publisher
        String publisherId = "Publicador_166";
        IMqttClient publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);

        // Connect to Broker
        MqttConnectOptions opts = new MqttConnectOptions();
        opts.setAutomaticReconnect(true);
        opts.setCleanSession(true);
        opts.setConnectionTimeout(10);
        publisher.connect(opts);

        // Sensor reading and publishing
        Sensor sensor = new Sensor();
        for (int i=0; i<100; i++) {
            double temperatura = sensor.readTemp();
            MqttMessage mqttMessage = createMessage(temperatura);

            publisher.publish(MyConstants.TOPIC_SENSOR, mqttMessage);

            Thread.sleep((2000));
        }

        publisher.disconnect();
    }

    /**
     * Create message object
     * @param value message value
     * @return Message object
     */
    private static MqttMessage createMessage(double value){
        byte [] payload = String.format("T:%04.2f", value).getBytes();
        return new MqttMessage(payload);
    }
}

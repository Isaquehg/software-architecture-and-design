package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.*;

/**
 * @author isaquehg
 * @since 4/12/23
 * @version 1.0
 * Subscriber class for sensors
 */
public class SensorSubscriber {
    public static void main(String[] args) throws MqttException {
        // Criar o publisher
        String subscriberId = "Subscriber_166";
        IMqttClient subscriber = new MqttClient(MyConstants.URI_BROKER, subscriberId);

        // Connect to Broker
        MqttConnectOptions opts = new MqttConnectOptions();
        opts.setAutomaticReconnect(true);
        opts.setCleanSession(true);
        opts.setConnectionTimeout(10);
        subscriber.connect(opts);

        // Subscribe to topic
        subscriber.subscribe(MyConstants.TOPIC_SENSOR, (topic, msg) -> {
            System.out.println("Mensagem Recebida: [" + msg + "] do tópico: " + topic);
        });
    }
}

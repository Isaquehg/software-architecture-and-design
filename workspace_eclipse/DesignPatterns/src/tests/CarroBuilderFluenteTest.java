package tests;

import builder.carro.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarroBuilderFluenteTest {
    @Test
    public void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido(){
        // Partes válidas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        FreioABS freioABS = new FreioABS();

        // API Fluente
        Carro carroPronto = new CarroBuilderFluente()
                .buildPortas(portas)
                .buildMotor(motorVTEC)
                .buildCompBordo(computadorDeBordo)
                .buildFreioABS(freioABS)
                .getCarro();

        // Asserts
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }
}

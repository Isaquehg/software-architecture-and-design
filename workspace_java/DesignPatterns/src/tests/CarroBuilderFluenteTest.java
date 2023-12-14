package tests;

import builder.carro.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for CarroBuilderFluente
 * @author isaquehg
 * @version 1.0
 * @since 10/10/23
 */
public class CarroBuilderFluenteTest {
    /**
     * Test case to ensure that a Carro is correctly built using the fluent builder pattern
     * with valid components (Motor, Portas, ComputadorDeBordo, and FreioABS).
     *
     * - Valid components are created (Motor, Portas, ComputadorDeBordo, and FreioABS).
     * - The fluent builder pattern is used to build a Carro instance.
     * - Assertions are made to ensure that the Carro is constructed correctly.
     */
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

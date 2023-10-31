package tests;

import builder.carro.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for CarroBuilder
 * @author isaquehg
 * @version 1.0
 * @since 9/10/23
 */
public class CarroBuilderTest {

    /**
     * Test case to ensure that a Carro is correctly built using the CarroBuilder
     * with valid components (Motor, Portas, ComputadorDeBordo, and FreioABS).
     *
     * - Valid components are created (Motor, Portas, ComputadorDeBordo, and FreioABS).
     * - The CarroBuilder is used to build a Carro instance.
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

        // CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildPortas(portas);
        carroBuilder.buildCompBordo(computadorDeBordo);
        carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildFreioABS(freioABS);

        Carro carroPronto = carroBuilder.getCarro();

        // Asserts
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }

    /**
     * Test case to ensure that an exception is thrown when attempting to build a Carro
     * without a Motor component using the CarroBuilder.
     *
     * - An attempt is made to build a Carro without a Motor component, and an exception is expected.
     */
    @Test
    public void dadoCarroSemMotor_quandoGetCarro_lancaException(){
        // Partes
        //Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        FreioABS freioABS = new FreioABS();

        // CarroBuilder sem buildMotor...
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildPortas(portas);
        carroBuilder.buildCompBordo(computadorDeBordo);
        //carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildFreioABS(freioABS);

        try{
            Carro carroPronto = carroBuilder.getCarro();
        }
        catch (IllegalStateException e){
            System.out.println("Lancou exception, como esperado");
        }
    }

    /**
     * Test case to ensure that an exception is thrown when attempting to build a Carro
     * without Portas components using the CarroBuilder.
     *
     * - An attempt is made to build a Carro without Portas components, and an exception is expected.
     */
    @Test
    public void dadoCarroSemPortas_quandoGetCarro_lancaException(){
        // Partes
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        //Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        FreioABS freioABS = new FreioABS();

        // CarroBuilder sem buildMotor...
        CarroBuilder carroBuilder = new CarroBuilder();
        //carroBuilder.buildPortas(portas);
        carroBuilder.buildCompBordo(computadorDeBordo);
        //carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildFreioABS(freioABS);

        try{
            Carro carroPronto = carroBuilder.getCarro();
        }
        catch (IllegalStateException e){
            System.out.println("Lancou exception, como esperado");
        }
    }
}

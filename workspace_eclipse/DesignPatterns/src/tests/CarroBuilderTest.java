package tests;

import builder.carro.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarroBuilderTest {
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

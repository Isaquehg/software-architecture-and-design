package tests;

import org.junit.jupiter.api.Test;
import strategy.frete.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for CalculadorFrete
 * @author isaquehg
 * @version 1.0
 * @since 23/10/23
 */
public class CalculadoraFreteTest {
    /**
     * Test case to calculate the shipping cost for the Sedex service.
     */
    @Test
    public void deveCalcularFreteParaSedex(){
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteSedex();
        double valorAtual = calculadoraFrete.calcularValor(fretavel, 0.0);
        double valorEsperado = 50.0;

        assertEquals(valorAtual, valorEsperado);
    }

    /**
     * Test case to calculate the shipping cost for the DHL service.
     */
    @Test
    public void deveCalcularFreteParaDhl(){
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
        double valorAtual = calculadoraFrete.calcularValor(new ServicoFreteDhl(), 0.0);
        double valorEsperado = 100.0;

        assertEquals(valorAtual, valorEsperado);
    }

    /**
     * Test case to calculate the shipping cost for the JadLog service.
     */
    @Test
    public void deveCalcularFreteParaJadlog(){
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
        ServicoFreteJadlog servicoFreteJadlog = new ServicoFreteJadlog();
        double valorAtual = calculadoraFrete.calcularValor(servicoFreteJadlog, 0.0);
        double valorEsperado = 0.0;

        assertEquals(valorAtual, valorEsperado);
    }

    /**
     * Test case to calculate the shipping cost for the FedEx service.
     */
    @Test
    public void deveCalcularFreteParaFedEx(){
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
        double valorAtual = calculadoraFrete.calcularValor(new ServicoFreteFedEx(), 0.0);
        double valorEsperado = 0.0;

        assertEquals(valorAtual, valorEsperado);
    }

    /*
    @Test
    public void deveLancarExceptionParaServicoDesconhecido(){
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        try{
            double valorAtual = calculadoraFrete.calcularValor("desconhecido", 25.0);
            fail("Deveria ter lançado exception!");
        }
        catch (RuntimeException e){
            System.out.println("OK.");
        }
    }
    */
}

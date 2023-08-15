package Contabilidade;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TributavelTest {
	
	@Test
	public void tributavelSimplesTest() {
		EmpresaSimples simples = new EmpresaSimples(1500000.00);
		Double valorIR = simples.getValorIR();
		Double valorIRExpected = 225000.0;
		
		Double valorISS = simples.getValorISS();
		Double valorISSExpected = 120000.00;
		
		assertEquals(valorIR, valorIRExpected);
		assertEquals(valorISS, valorISSExpected);
	}
	
	@Test
	public void tributavelMEITest() {
		EmpresaMEI mei = new EmpresaMEI(1500000.00);
		Double valorIR = mei.getValorIR();
		Double valorIRExpected = 412500.00000000006;
		
		Double valorISS = mei.getValorISS();
		Double valorISSExpected = 0.0;
		
		assertEquals(valorIR, valorIRExpected);
		assertEquals(valorISS, valorISSExpected);
	}
}

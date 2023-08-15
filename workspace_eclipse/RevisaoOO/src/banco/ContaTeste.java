package banco;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class ContaTeste {
	
	@Test
	public void rentabilizarCorrente() {
		Conta cc = new ContaCorrente();
		cc.depositar(15000.00);
		cc.sacar(5000.00);
		cc.rentabilizar();
		
		Double saldoAtual = cc.saldo;
		Double saldoEsperado = 10100.0;
		
		assertEquals(saldoAtual, saldoEsperado);
	}
	
	@Test
	public void rentabilizarPoupanca() {
		Conta cp = new ContaPoupanca();
		cp.depositar(25000.00);
		cp.sacar(5000.00);
		cp.rentabilizar();
		
		Double saldoAtual = cp.saldo;
		Double saldoEsperado = 20400.00;
		
		assertEquals(saldoAtual, saldoEsperado);
	}
}

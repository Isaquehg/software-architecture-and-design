package banco;

public abstract class Conta {
	public Double saldo = 0.0;
	
	public abstract void rentabilizar();
	public void depositar(Double valor) {
		saldo += valor;
	}
	public void sacar(Double valor) {
		saldo -= valor;
	}
}

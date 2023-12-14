package banco;

public abstract class Conta {
	public Double saldo = 0.0;
	
	public abstract void rentabilizar();
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}

	public void depositar(Double valor) {
		saldo += valor;
	}
	public void sacar(Double valor) {
		saldo -= valor;
	}
}

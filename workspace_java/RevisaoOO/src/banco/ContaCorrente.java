package banco;

public class ContaCorrente extends Conta{
	@Override
	public void rentabilizar() {
		saldo *= 1.01;
	}

}

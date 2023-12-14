package banco;

public class ContaPoupanca extends Conta{

	@Override
	public void rentabilizar() {
		saldo *= 1.02;
	}

}

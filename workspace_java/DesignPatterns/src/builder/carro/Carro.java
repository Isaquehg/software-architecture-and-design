package builder.carro;

/**
 * Car Java Bean class
 * @author Isaque
 * @version 1.0
 * @since 10/10/23
 */
public class Carro {

	private Porta[] portas;

	private Motor motor;

	private ComputadorDeBordo computadorBordo;

	private FreioABS freioABS;

	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public ComputadorDeBordo getComputadorBordo() {
		return computadorBordo;
	}

	public void setComputadorBordo(ComputadorDeBordo computadorBordo) {
		this.computadorBordo = computadorBordo;
	}

	public FreioABS getFreioABS() {
		return freioABS;
	}

	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
}

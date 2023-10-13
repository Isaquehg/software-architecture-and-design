package builder.carro;

public class CarroBuilder {

	private Carro carro = new Carro();

	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}

	public void buildMotor(Motor motor) {
		carro.setMotor(motor);
	}

	public void buildCompBordo(ComputadorDeBordo compBordo) {
		carro.setComputadorBordo(compBordo);
	}

	public void buildFreioABS(FreioABS freioABS) {
		carro.setFreioABS(freioABS);
	}

	private void validarPortas(){
		if(carro.getPortas() == null){
			throw new IllegalStateException("Não tem portas...");
		}

		int nPortas = carro.getPortas().length;
		if(nPortas != 2 && nPortas != 4){
			throw new IllegalStateException("Número de portas inválido");
		}
	}

	private void validarMotor(){
		if(carro.getMotor() == null){
			throw new IllegalStateException("Não tem motor!");
		}
	}

	public Carro getCarro() {
		// Sanitizing car construction
		validarMotor();
		validarPortas();

		return carro;
	}
}
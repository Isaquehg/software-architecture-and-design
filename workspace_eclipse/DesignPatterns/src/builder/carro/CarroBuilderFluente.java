package builder.carro;

/**
 * Class for buiding Car's Class (Fluent)
 * @author Isaque
 * @version 1.0
 * @since 10/10/23
 */
public class CarroBuilderFluente {

    private Carro carro = new Carro();

    public CarroBuilderFluente buildPortas(Porta[] portas) {
        carro.setPortas(portas);
        return this;
    }

    public CarroBuilderFluente buildMotor(Motor motor) {
        carro.setMotor(motor);
        return this;
    }

    public CarroBuilderFluente buildCompBordo(ComputadorDeBordo compBordo) {
        carro.setComputadorBordo(compBordo);
        return this;
    }

    public CarroBuilderFluente buildFreioABS(FreioABS freioABS) {
        carro.setFreioABS(freioABS);
        return this;
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

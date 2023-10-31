package strategy.frete;

/**
 * Interface for common implementations
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ServicoFreteDhl implements Fretavel{
    /**
     * Calculate delivery value
     * @param pesoEmKg weight of the delivered object
     * @return value to pay for
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if(pesoEmKg < 20.0){
            return 100.0;
        }
        else{
            return 190.0;
        }
    }
}

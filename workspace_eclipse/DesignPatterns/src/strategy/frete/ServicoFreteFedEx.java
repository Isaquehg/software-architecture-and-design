package strategy.frete;

/**
 * FedEx's specification from interface
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ServicoFreteFedEx implements Fretavel{
    @Override
    public double calcularValor(double pesoEmKg) {
        if(pesoEmKg < 20.0){
            return 0.0;
        }
        else if(pesoEmKg > 20.1 && pesoEmKg < 39.9){
            return 45.0;
        }
        else{
            return 75.0;
        }
    }
}

package strategy.frete;

/**
 * Sedex's specification from interface
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ServicoFreteSedex implements Fretavel{

    @Override
    public double calcularValor(double pesoEmKg) {
        if(pesoEmKg < 10.0){
            return 50.0;
        } else if (pesoEmKg <20.0) {
            return 70.0;
        } else{
            return 90.0;
        }
    }
}

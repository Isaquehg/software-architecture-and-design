package strategy.frete;

/**
 * JadLog's specification from interface
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ServicoFreteJadlog implements Fretavel{
    @Override
    public double calcularValor(double pesoEmKg) {
        if(pesoEmKg < 30.0){
            return 0.0;
        }
        else{
            return 150.0;
        }
    }
}

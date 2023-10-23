package strategy.frete;

public class ServicoFreteDhl implements Fretavel{
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

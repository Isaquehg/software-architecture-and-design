package strategy.frete;

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

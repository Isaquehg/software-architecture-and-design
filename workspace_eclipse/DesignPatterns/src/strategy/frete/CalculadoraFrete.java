package strategy.frete;

public class CalculadoraFrete{
    public double calcularValor(Fretavel fretavel, double pesoEmKg){
        return fretavel.calcularValor(pesoEmKg);

        /* SEM STRATEGY
        // Sedex
        if("sedex".equals(servico)){
            if(pesoEmKg < 10.0){
                return 50.0;
            } else if (pesoEmKg <20.0) {
                return 70.0;
            } else{
                return 90.0;
            }
        }

        // DHL
        if("dhl".equals(servico)){
            if(pesoEmKg < 20.0){
                return 100.0;
            }
            else{
                return 190.0;
            }
        }

        // Jadlog
        if("jadlog".equals(servico)){
            if(pesoEmKg < 30.0){
                return 0.0;
            }
            else{
                return 150.0;
            }
        }

        throw new RuntimeException("Serviço não conhecido.");
         */
    }
}

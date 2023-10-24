package strategy.impostos;

public class ImpostoIVA implements Tributavel{
    private final static double ALIQUOTA_IVA = 0.05;

    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_IVA;
    }
}

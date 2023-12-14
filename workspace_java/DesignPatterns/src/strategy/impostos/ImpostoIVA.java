package strategy.impostos;

/**
 * IVA's specification from interface
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ImpostoIVA implements Tributavel{
    private final static double ALIQUOTA_IVA = 0.05;

    /**
     * Calculate issued taxes for a given invoice and given tax rate
     * @param valorTotalNF invoice's value
     * @return tax value to be paid
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_IVA;
    }
}

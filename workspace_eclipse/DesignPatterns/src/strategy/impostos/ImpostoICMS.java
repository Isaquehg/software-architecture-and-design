package strategy.impostos;

/**
 * ICMS' specification from interface
 * @author Isaque
 * @version 1.0
 * @since 24/10/23
 */
public class ImpostoICMS implements Tributavel{
    private static final double ALIQUOTA_ICMS = 0.1;

    /**
     * Calculate issued taxes for a given invoice and given tax rate
     * @param valorTotalNF invoice's value
     * @return tax value to be paid
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ICMS;
    }
}

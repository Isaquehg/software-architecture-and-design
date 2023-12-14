package strategy.impostos;

/**
 * ISS' specification from interface
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ImpostosISS implements Tributavel{
    private static final double ALIQUOTA_ISS = 0.02;

    /**
     * Calculate issued taxes for a given invoice and given tax rate
     * @param valorTotalNF invoice's value
     * @return tax value to be paid
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ISS;
    }
}

package strategy.impostos;

/**
 * Interface for further common taxes' implementations
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public interface Tributavel {
    public double calcularImposto(double valorTotalNF);
}

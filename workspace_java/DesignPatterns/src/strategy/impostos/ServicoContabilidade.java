package strategy.impostos;

import java.util.List;

/**
 * Contability services
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class ServicoContabilidade {
    /**
     * Sum all must-to-pay taxes for given invoice
     * @param invoice object
     * @param supported taxes list
     * @return total taxes to be paid
     */
    public double totalizarImpostos(NotaFiscal nf, List<Tributavel> listaImpostos){
        double valorTotalNF = nf.getValorTotal();
        return listaImpostos
                .stream()
                .map(t -> t.calcularImposto(valorTotalNF))
                .reduce(0.0, Double::sum);

        /*
        double impostosTotalizados = 0.0;


        for (Tributavel tributavel:listaImpostos) {
            impostosTotalizados += tributavel.calcularImposto(valorTotalNF);
        }

        return impostosTotalizados;
         */
    }
}

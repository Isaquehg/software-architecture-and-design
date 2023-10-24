package strategy.impostos;

import java.util.List;

public class ServicoContabilidade {
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

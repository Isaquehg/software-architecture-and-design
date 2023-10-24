package tests;

import org.junit.jupiter.api.Test;
import strategy.impostos.NotaFiscal;
import strategy.impostos.ReceitaFederal;
import strategy.impostos.ServicoContabilidade;
import strategy.impostos.Tributavel;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoContabilidadeTest {

    @Test
    void deveTotalizarImpostosDaNotaFiscal(){
        // NF
        NotaFiscal nf = new NotaFiscal(123L, LocalDate.of(2023, 10, 24), 1000.0);

        // RF
        ReceitaFederal receitaFederal = new ReceitaFederal();
        List<Tributavel> impostosVigentes = receitaFederal.buscarListaImpostosVigentes();

        // Contabilidade
        ServicoContabilidade servicoContabilidade = new ServicoContabilidade();
        double impostosTotalizadosAtual = servicoContabilidade.totalizarImpostos(nf, impostosVigentes);

        double impostosTotalizadosEsperado = 170.0;

        assertEquals(impostosTotalizadosAtual, impostosTotalizadosEsperado);
    }
}

package tests;

import org.junit.jupiter.api.Test;
import strategy.impostos.NotaFiscal;
import strategy.impostos.ReceitaFederal;
import strategy.impostos.ServicoContabilidade;
import strategy.impostos.Tributavel;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for ServicoContabilidade
 * @author isaquehg
 * @version 1.0
 * @since 24/10/23
 */
public class ServicoContabilidadeTest {

    /**
     * Test case to ensure that the total amount of taxes on a Nota Fiscal (NF)
     * is correctly calculated by the ServicoContabilidade using impostos provided
     * by the ReceitaFederal.
     *
     * - A Nota Fiscal (NF) is created with a specific value.
     * - The ReceitaFederal is used to obtain a list of currently applicable taxes (impostos).
     * - The ServicoContabilidade is then used to calculate the total taxes on the NF
     *   using the provided impostos.
     * - The calculated total of taxes is compared with the expected value.
     */
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

package strategy.impostos;

import java.time.LocalDate;

/**
 * Ticker class representation
 * @author Isaque
 * @version 1.0
 * @since 23/10/23
 */
public class NotaFiscal {
    private long numero;
    private LocalDate dataEmissao;
    private double valorTotal;

    /**
     * Constructor for invoice's object
     * @param ID
     * @param invoice's inssuance date
     * @param invoice's value
     */
    public NotaFiscal(long numero, LocalDate dataEmissao, double valorTotal) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

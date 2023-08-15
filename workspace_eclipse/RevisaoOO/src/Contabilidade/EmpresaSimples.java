package Contabilidade;

public class EmpresaSimples implements Tributavel{
	Double faturamentoMensal;
	
	EmpresaSimples(Double faturamentoMensal){
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public double getValorIR() {
		return faturamentoMensal * 0.15;
	}

	@Override
	public double getValorISS() {
		return faturamentoMensal * 0.08;
	}

}

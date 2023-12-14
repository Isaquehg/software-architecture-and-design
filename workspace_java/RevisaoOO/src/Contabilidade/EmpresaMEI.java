package Contabilidade;

public class EmpresaMEI implements Tributavel{
	Double faturamentoMensal;
	
	EmpresaMEI(Double faturamentoMensal){
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public double getValorIR() {
		return faturamentoMensal * 0.275;
	}

	@Override
	public double getValorISS() {
		return 0;
	}

}

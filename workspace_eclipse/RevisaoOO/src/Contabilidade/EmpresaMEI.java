package Contabilidade;

public class EmpresaMEI implements Tributavel{
	Double faturamentoMensal;
	
	EmpresaMEI(Double faturamentoMensal){
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public double getValorIR() {
		// TODO Auto-generated method stub
		return faturamentoMensal * 0.275;
	}

	@Override
	public double getValorISS() {
		// TODO Auto-generated method stub
		return 0;
	}

}

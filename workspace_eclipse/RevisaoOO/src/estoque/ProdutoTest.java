package estoque;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
	@Test
	public void testProdutoComoJavaBean(){
		Produto p1 = new Produto();
		p1.setDescricao("Coca-Cola 310ml");
		p1.setDataValidade(LocalDate.of(2023, 12, 05));
		p1.setValorCompra(4.25);
		
		System.out.println("Dados do Produto: ");
		System.out.println(p1.getDescricao());
		System.out.println(p1.getValorCompra());
		System.out.println(p1.getDataValidade());
		System.out.println(p1.vencido());
	}
}

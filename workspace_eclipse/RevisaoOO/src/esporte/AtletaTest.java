package esporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtletaTest {

	@Test
	void testarConstrutor() {
		Pessoa pessoaEdson = new Pessoa("Edson", 21);
		
		System.out.println(pessoaEdson.nome);
		System.out.println(pessoaEdson.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 21, 80, false);
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
	}
	
	@Test
	void testarNadador() {
		Nadador nadadorEdson = new Nadador("Edson", 21, 80, false);
		System.out.println(nadadorEdson.nome);
		System.out.println(nadadorEdson.idade);
		nadadorEdson.nadar();
	}
	
	@Test
	void testarCorredor() {
		Corredor corredorEdson = new Corredor("Edson", 21, 80, false);
		System.out.println(corredorEdson.nome);
		System.out.println(corredorEdson.idade);
		corredorEdson.correr();
	}
	
	@Test
	void testarCiclista() {
		Ciclista ciclistaEdson = new Ciclista("Edson", 21, 80, false);
		System.out.println(ciclistaEdson.nome);
		System.out.println(ciclistaEdson.idade);
		ciclistaEdson.pedalar();
	}

}

package cidadania;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Idade: ");
		Integer idade = scanner.nextInt();
		System.out.println("CPF: ");
		String cpf = scanner.nextLine();
		System.out.println("Sexo: ");
		String sexo = scanner.nextLine();
		Cidadao cidadao1 = new Cidadao(nome, sexo, idade, cpf);
		System.out.println(cidadao1.nome);
		System.out.println(cidadao1.sexo);
		System.out.println(cidadao1.idade);
		System.out.println(cidadao1.cpf);
	}

}

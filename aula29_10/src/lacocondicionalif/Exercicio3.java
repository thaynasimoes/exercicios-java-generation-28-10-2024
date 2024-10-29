package lacocondicionalif;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if ((idade >= 18) && (idade <= 69) ) {
			if (idade < 60 || (idade >= 60 && !primeiraDoacao)) {
                System.out.println(nome + " está Apto para doar sangue.");
            }
			else {
                System.out.println(nome + " não está Apto para doar sangue.");
            }
		}
		leia.close();

		
	}

}

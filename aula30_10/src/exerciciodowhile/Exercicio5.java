package exerciciodowhile;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, somaPositivo = 0;
		boolean zero = false;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				somaPositivo = somaPositivo + numero;
			}
			
			
		}while(numero !=0);
		
		System.out.println("A soma dos números positivos é: " + somaPositivo);

		
		
	}

}

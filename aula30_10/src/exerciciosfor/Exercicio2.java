package exerciciosfor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numerosImpares = 0, numerosPares = 0, numero;
		
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "º número: ");
			numero = leia.nextInt();
			
			
			if(numero % 2 == 0) {
				numerosPares++;
			}
			else {
				numerosImpares++;
			}
			
			
		}
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números ímpares: " + numerosImpares);
		
		leia.close();
		
	}

}

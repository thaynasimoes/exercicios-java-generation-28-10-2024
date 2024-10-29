package lacocondicionalif;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int A, B, C, somaAB;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		somaAB = A + B;
		
		if (somaAB > C) {
			System.out.println( A + " + " + B + " = " + somaAB + " > " + C + " A soma de A e B é maior que C");
		}
		
		if (somaAB > C) {
			System.out.println( A + " + " + B + " = " + somaAB + " > " + C + " A soma de A e B é maior que C");
		}
		
		if (somaAB == C) {
			System.out.println( A + " + " + B + " = " + somaAB + " == " + C + " A soma de A e B é igual a C");
		}
		
	}

}

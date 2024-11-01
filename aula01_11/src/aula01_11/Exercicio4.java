package aula01_11;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);

		
		HashSet<Integer> valores = new HashSet<Integer>();
		int numeroDigitado;

		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		valores.add(7);
		valores.add(8);
		valores.add(9);
		valores.add(10);
		
		System.out.println("Digite um número inteiro: ");
		numeroDigitado = leia.nextInt();
		
		if(valores.contains(numeroDigitado)) {
			System.out.println("Número " + numeroDigitado + " encontrado!");
		}
		else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}
		
		leia.close();
		
	}

}

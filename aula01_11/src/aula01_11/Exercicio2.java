package aula01_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroDigitado, index;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);

		System.out.println("Digite um número inteiro: ");
		numeroDigitado = leia.nextInt();

		index = numeros.indexOf(numeroDigitado);

		if (numeros.contains(numeroDigitado)) {
			System.out.println("A posição de " + numeroDigitado + " é " + index);
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

		leia.close();

	}

}

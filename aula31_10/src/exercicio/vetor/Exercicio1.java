package exercicio.vetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroDigitado;
		boolean  encontrado = false;
		int posicaoNumero = 0;
		
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		for (int posicao = 0; posicao < numeros.length; posicao++) {
			if( numeroDigitado == numeros[posicao] ) {
				encontrado = true;
				posicaoNumero = posicao;
				break;
			}
		}
		if(encontrado) {
			System.out.println("O número " + numeroDigitado + " está localizado na posição: " + posicaoNumero);
		}
		else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado.");
		}
	
		
		
		leia.close();
		
		
		
		
	}

}

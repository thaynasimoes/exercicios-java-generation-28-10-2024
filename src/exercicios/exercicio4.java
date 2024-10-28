package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4, calculo;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o quarto numero: ");
		numero4 = leia.nextFloat();
		
		calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("O resultado do cálculo é: " + calculo);

	}

}

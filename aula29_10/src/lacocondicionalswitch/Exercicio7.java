package lacocondicionalswitch;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float n1, n2, resultado;
		int operacao;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("=============================");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Mulltiplicação");
		System.out.println("4- Divisão");
		System.out.println("Digite a operação desejada: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
			
			case 1: {
			resultado = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + resultado);
			}break;
			
			case 2: {
				resultado = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + resultado);
				}break;
				
			case 3: {
				resultado = n1 * n2;
				System.out.println(n1 + " x " + n2 + " = " + resultado);
				}break;
				
			case 4: {
				resultado = n1 / n2;
				System.out.println(n1 + " ÷ " + n2 + " = " + resultado);
				}break;
				
			default:
                System.out.println("Operação inválida!");
                break;
		}
		
	leia.close();
	}

}

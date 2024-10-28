package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
		
		
		
		
	}

}

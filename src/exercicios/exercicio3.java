package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o  valor de seu salário bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Digite o  valor de seu adicionak noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o  valor de suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o  valor de seus descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Esse é o valor de seu salário líquido: " + salarioLiquido);
	}

}

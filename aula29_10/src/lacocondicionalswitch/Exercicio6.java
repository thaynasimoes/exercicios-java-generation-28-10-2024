package lacocondicionalswitch;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome;
		int codigoCargo;
		float salario, salarioReajustado;
		
		System.out.println("Informe o nome do colaborador: ");
		nome = leia.nextLine();
		
		
		System.out.println("1- Gerente ");
		System.out.println("2- Vendedor ");
		System.out.println("3- Supervisor ");
		System.out.println("4- Motorista ");
		System.out.println("5- Estoquista ");
		System.out.println("6- Técnico de  TI ");
		System.out.println("==============================");
		System.out.println("Informe o código do cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Informe o valor de seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Nome do colaborador: " + nome);
		
		
				
		switch (codigoCargo) {
		
		case 1: {
			System.out.println("Cargo: Gerente");
			salarioReajustado = salario + (salario * 10/100);
			System.out.println("Salário: " + salarioReajustado);
		}break;
		
		case 2: {
			System.out.println("Cargo: Vendedor");
			salarioReajustado = salario + (salario * 7/100);
			System.out.println("Salário: " + salarioReajustado);
		}break;
		
		case 3: {
			System.out.println("Cargo: Supervisor");
			salarioReajustado = salario + (salario * 9/100);
			System.out.println("Salário: " + salarioReajustado);
		}break;
		
		case 4: {
			System.out.println("Cargo: Motorista");
			salarioReajustado = salario + (salario * 6/100);
			System.out.println("Salário: " + salarioReajustado);
		}break;
		
		case 5: {
			System.out.println("Cargo: Estoquista");
			salarioReajustado = salario + (salario * 5/100);
			System.out.println("Salário: " + salarioReajustado);
		}break;
		
		case 6: {
			System.out.println("Cargo: Técnico de TI");
			salarioReajustado = salario + (salario * 8/100);
			System.out.println("Salário: " + salarioReajustado);
		}break;
		
		default:
            System.out.println("Cargo inválido!");
            break;
		
		}
		 
	leia.close();
	}

}

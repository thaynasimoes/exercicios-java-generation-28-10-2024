package aula01_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a " + i + "ª cor: ");
			cores.add(leia.nextLine());
		}
		
		System.out.println("As cores que foram adicionadas são: " + cores);
		
		cores.sort(null);
		
		System.out.println("As cores que foram adicionadas em ordem crescente são : " + cores);

		
	}

}

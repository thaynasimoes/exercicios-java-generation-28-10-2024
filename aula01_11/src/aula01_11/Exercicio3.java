package aula01_11;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> valores = new TreeSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º numero (não digite um número repetido): ");
			valores.add(leia.nextInt());
		}
		
		
		
		Iterator<Integer> iterator = valores.iterator();

		
		System.out.println("\nListar dados do Set:");
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
		leia.close();

	}

}

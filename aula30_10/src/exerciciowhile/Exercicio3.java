package exerciciowhile;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade, idadeMenor21 = 0, idadeMenor50 = 0;
        boolean continua = true;
        
        while (continua) {
            System.out.println("Digite uma idade ou um número negativo para sair: ");
            idade = leia.nextInt();
            
            if (idade < 0) {
                System.out.println("Idade inválida!");
                break;
            }
            if (idade < 21) {
                idadeMenor21++;
            } else if (idade > 50) { 
                idadeMenor50++; 
            }
        }
        
        System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + idadeMenor50);

        leia.close();
    }
}

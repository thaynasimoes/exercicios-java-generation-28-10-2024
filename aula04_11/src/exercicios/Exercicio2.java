package exercicios;
import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nDigite uma opção:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros na pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nLivro adicionado!");
                    mostrarPilha(pilhaLivros);
                    break;

                case 2:
                    System.out.println("\nLista de Livros na Pilha:");
                    mostrarPilha(pilhaLivros);
                    break;

                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("\nO Livro \"" + livroRetirado + "\" foi retirado da pilha!");
                        mostrarPilha(pilhaLivros);
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção Inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void mostrarPilha(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A Pilha está vazia!");
        } else {
            System.out.println("Pilha:");
            for (String livro : pilha) {
                System.out.println(livro);
            }
        }
    }
}

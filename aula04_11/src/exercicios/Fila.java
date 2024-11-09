package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nDigite uma opção:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Finalizar o programa");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("\nCliente Adicionado!");
                    mostrarFila(filaClientes);
                    break;

                case 2:
                    System.out.println("\nLista de Clientes na Fila:");
                    mostrarFila(filaClientes);
                    break;

                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("\nO Cliente " + clienteChamado + " foi chamado!");
                        mostrarFila(filaClientes);
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

    private static void mostrarFila(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A Fila está vazia!");
        } else {
            System.out.println("Fila:");
            for (String cliente : fila) {
                System.out.println(cliente);
            }
        }
    }
}

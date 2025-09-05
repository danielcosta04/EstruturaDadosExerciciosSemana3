package controle;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        // Cria objeto Scanner para capturar dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor de inteiros com 10 posições
        int[] vetor = new int[10];

        // Solicita ao usuário que digite 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            // Exibe a posição atual para facilitar a entrada
            System.out.print("Número " + (i + 1) + ": ");
            // Lê o valor digitado e armazena no vetor
            vetor[i] = scanner.nextInt();
        }

        // Cria objeto da classe NumeroArray, passando o vetor preenchido
        NumeroArray ordenador = new NumeroArray(vetor);

        // Mostra o array original (antes da ordenação)
        System.out.println("\nArray original:");
        ordenador.imprimirArray();

        // Ordena o array utilizando o método Bubble Sort
        ordenador.bubbleSort();

        // Mostra o array após ser ordenado
        System.out.println("Array ordenado (Bubble Sort):");
        ordenador.imprimirArray();

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}

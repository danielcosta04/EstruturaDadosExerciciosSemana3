package controle;

import java.util.Scanner;

import dominio.NumeroArray; 

public class Principal {
    public static void main(String[] args) {
        // Cria objeto Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor de inteiros com 5 posições
        int[] vetor = new int[5];

        // Solicita ao usuário que digite números inteiros
        System.out.println("Digite 10 números inteiros:"); 
        // ⚠️ Observação: a mensagem pede 10 números, mas o vetor só tem espaço para 5.
        // Se quiser 10, o correto seria: int[] vetor = new int[10];

        // Preenche o vetor com os valores digitados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt(); // lê o próximo número e guarda no vetor
        }

        // Cria objeto da classe NumeroArray passando o vetor preenchido
        NumeroArray numArray = new NumeroArray(vetor);

        // Exibe os números armazenados no array
        numArray.imprimirArray();

        // Solicita um número que o usuário deseja buscar no array
        System.out.print("Digite um número para buscar no array: ");
        int busca = scanner.nextInt();

        // Chama o método da classe NumeroArray para buscar o número no vetor
        int[] posicoes = numArray.buscarOcorrencias(busca);

        // Verifica se o número foi encontrado
        if (posicoes.length == 0) {
            // Se o array de posições estiver vazio, o número não existe no vetor
            System.out.println("O número " + busca + " NÃO foi encontrado no array.");
        } else {
            // Caso contrário, mostra em quais índices o número aparece
            System.out.print("O número " + busca + " foi encontrado nas posições (índices): ");
            for (int i = 0; i < posicoes.length; i++) {
                System.out.print(posicoes[i]); // imprime cada índice encontrado
                if (i < posicoes.length - 1) System.out.print(", "); // separador entre índices
            }
            System.out.println(); // quebra de linha no final
        }

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}

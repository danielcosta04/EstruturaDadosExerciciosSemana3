package controle;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor de inteiros com 10 posições
        int[] vetor = new int[10];

        // Pede ao usuário que digite os números
        System.out.println("Digite 20 números inteiros:"); // <-- aqui está pedindo 20, mas o vetor tem 10 posições
        for (int i = 0; i < vetor.length; i++) {
            // Solicita o número correspondente à posição atual
            System.out.print("Número " + (i + 1) + ": ");
            // Lê o número digitado e armazena na posição correta do vetor
            vetor[i] = scanner.nextInt();
        }

        // Cria um objeto da classe NumeroArray, passando o vetor preenchido como parâmetro
        NumeroArray numArray = new NumeroArray(vetor);

        // Chama o método para imprimir o array digitado
        numArray.imprimirArray();

        // Chama o método para contar e exibir a quantidade de pares e ímpares
        numArray.contarParesEImpares();

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}

package dominio;

public class NumeroArray {
    // Atributo que armazena o array de números inteiros
    private int[] numeros;

    // Construtor que recebe um array de inteiros e inicializa o atributo da classe
    public NumeroArray(int[] numeros) {
        this.numeros = numeros;
    }

    // Método para contar quantos números pares e ímpares existem no array
    public void contarParesEImpares() {
        int pares = 0;     // contador para números pares
        int impares = 0;   // contador para números ímpares

        // Percorre cada número do array usando for-each
        for (int n : numeros) {
            // Se o resto da divisão por 2 for 0, é par
            if (n % 2 == 0) {
                pares++;
            } else {
                // Caso contrário, é ímpar
                impares++;
            }
        }

        // Exibe os resultados no console
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }

    // Método para imprimir todos os elementos do array
    public void imprimirArray() {
        System.out.print("Array digitado: ");
        
        // Percorre o array e imprime cada número separado por espaço
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        
        System.out.println(); // quebra de linha no final da impressão
    }
}

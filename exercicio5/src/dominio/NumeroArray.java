package dominio;

public class NumeroArray { 
    // Atributo que armazena os números em um array
    private int[] numeros;

    // Construtor que recebe um array de inteiros e o armazena no atributo
    public NumeroArray(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * Método que implementa o algoritmo Bubble Sort.
     * Ele percorre o array várias vezes, comparando elementos adjacentes
     * e trocando-os de posição caso estejam fora de ordem.
     */
    public void bubbleSort() {
        int n = numeros.length;   // tamanho do array
        boolean trocou;           // flag para verificar se houve troca na passagem

        // Laço externo: repete o processo até o array estar ordenado
        for (int i = 0; i < n - 1; i++) {
            trocou = false; // a cada iteração assume que não houve troca

            // Laço interno: percorre o array até a última posição não ordenada
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara elementos adjacentes
                if (numeros[j] > numeros[j + 1]) {
                    // Se estiverem fora de ordem, troca de posição
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;

                    // Marca que houve troca nesta iteração
                    trocou = true;
                }
            }

            // Se nenhuma troca foi feita, o array já está ordenado → encerra o loop
            if (!trocou) {
                break;
            }
        }
    }

    // Método que imprime todos os elementos do array
    public void imprimirArray() {
        for (int n : numeros) {
            System.out.print(n + " "); // imprime cada número seguido de espaço
        }
        System.out.println(); // quebra de linha ao final
    }
}

package dominio;

public class NumeroArray { 
    // Atributo que armazena os números do array
    private int[] numeros;

    // Construtor que recebe um array de inteiros e inicializa o atributo
    public NumeroArray(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * Método que busca todas as ocorrências de um valor dentro do array.
     * Retorna um novo array contendo as posições (índices) onde o valor foi encontrado.
     */
    public int[] buscarOcorrencias(int valor) {
        // Array auxiliar com o mesmo tamanho do array original
        // (inicialmente pode sobrar espaço, depois será ajustado)
        int[] posicoesTemp = new int[numeros.length]; 
        int contador = 0; // contador de quantas vezes o valor foi encontrado

        // Percorre todo o array
        for (int i = 0; i < numeros.length; i++) {
            // Se o valor atual for igual ao buscado
            if (numeros[i] == valor) {
                // Guarda a posição (índice) no array auxiliar
                posicoesTemp[contador] = i;
                contador++; // incrementa o número de ocorrências encontradas
            }
        }

        // Cria um novo array com o tamanho exato das ocorrências encontradas
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            // Copia apenas as posições válidas do array auxiliar
            resultado[i] = posicoesTemp[i];
        }

        // Retorna o array final com as posições onde o valor foi encontrado
        return resultado;
    }

    // Método que imprime todos os elementos do array
    public void imprimirArray() {
        System.out.print("Array: ");
        // Percorre cada número do array e imprime na mesma linha
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println(); // quebra de linha no final
    }
}

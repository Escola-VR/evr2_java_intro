package algoritmos;

import java.util.Random;

public class Matrizes {
    public static void main(String[] args) {
        // Vetores são variaveis indexadas unidimensionais
        // v:vetor[1..10] de inteiro
        int[] vetor = new int[10];

        /*
         * PARA i DE 1 ATE 10 FACA
         *  v[i] <- randi(100)
         * FIMPARA
         */
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Random().nextInt(100) + 1;
        }
        /*
         * PARA i DE 1 ATE 10 FACA
         *  ESCREVAL("vetor[",i,"]: ",v[i])
         * FIMPARA
         */
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%s]: %s\n", i, vetor[i]);
        }

        //TODO: Matrizes
        // Matrizes são arrays de mais de 1 dimensão

        // m:vetor[1..5,1..6] de inteiro

        int[][] m = new int[5][6];

        System.out.println("\ntamanho matriz m: "+m.length+" linhas");
        System.out.println("tamanho matriz m: "+m[0].length+" colunas\n");

        // Percorrer as linhas da matriz
        for (int i = 0; i < m.length; i++) {
            // System.out.println("Passei pela linha "+ i);
            for (int j = 0; j < m[0].length; j++) {
                // System.out.println("Passei pela coluna "+j);
                m[i][j] = new Random().nextInt(100) + 1;
            }
        }

        System.out.println("Matriz 5 X 6\n");
        //TODO: Exibir a Matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                // Exibe o valor da posiçao atual e uma tabulação
                System.out.printf("%s\t", m[i][j]);
            }
            // Salta o cursor para a próxima linha, já que a saída anterio não o faz.
            System.out.println();
        }

        //TODO: Exercícios práticos de aprendizagem
        /*
         * 1. Armazenar e exibir os nome e cpfs de 5 pessoas em 2 arrays.
         * 2. Armazenar e exibir os dados de 5 produtos em uma matriz,
         *  cada produto deve conter:
         *      * codigo, codigo de barras, descricao, preço.
         */



    }
}

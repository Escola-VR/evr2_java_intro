package algoritmos;

import java.util.Scanner;

public class ExerciciosMatrizes {
    public static void main(String[] args) {
        // Exercicio I

        String[] nome = new String[5];
        long[] cpf = new long[5];

        Scanner entrada = new Scanner(System.in);

        //Preeenche os 2 vetores num unica estrutura de repeticao
        for (int i = 0; i < cpf.length; i++) {
            System.out.println("Digite no nome.");
            nome[i] = entrada.nextLine();

            System.out.println("Digite no CPF.");
            cpf[i] = entrada.nextLong();
            entrada.nextLine();
        }

        //Exibe os 2 vetores num unica estrutura de repeticao
        for (int i = 0; i < cpf.length; i++) {
            System.out.printf("Nome: %s\tCPF: %s\n", nome[i], cpf[i]);
        }

        // Exercicio II - Matriz de Produtos

        // Declaração da Matriz
        String[][] produtos = new String[5][4];

        // Geramos um array para que cada frase seja exibida com base na coluna atual.
        String[] frases = new String[produtos.length];
        frases[0] = "Digite o código:";
        frases[1] = "Digite o código de barras:";
        frases[2] = "Digite a descroção:";
        frases[4] = "Digite o preço:";

        // Preenche a Matriz utilizando uma frase especifica em cada coluna.
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < produtos[0].length; j++) {
                // O j(posicao da coluna) define a frase combase no arra frases
                System.out.println(frases[j]);
            }
        }

        /**
         * Esta forma utiliza uma unica estrutura de vetor para preencher a matriz.
         * As colunas e suas respectivas frases são definidas manualmente.
        
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Digite o código:");
            produtos[i][0] = entrada.nextLine();
            System.out.printf("Digite o código de barras:");
            produtos[i][1] = entrada.nextLine();
            System.out.printf("Digite a descroção:");
            produtos[i][2] = entrada.nextLine();
            System.out.printf("Digite o preço:");
            produtos[i][3] = entrada.nextLine();
        }
        */

        System.out.println("COD\tCOD.BAR\tDESC.\tPRECO");
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < produtos[0].length; j++) {
                System.out.printf("%s\t", produtos[i][j]);
            }
            System.out.println();
        }

        entrada.close();
    }
}

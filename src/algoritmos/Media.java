package algoritmos;

import java.util.Scanner;

public class Media {

    // Comentario de linha unica

    /*
     * Comentarios de multiplas linhas
     * Mais uma linha
     * Outra linha
     */


    /**
     * Calcula a media ponderada com base nos pesos informados.
     * O primeiro peso é 3 e o segundo é 7.
     * @param n1 - double primeira nota
     * @param n2 - double primeira nota
     * @return - double Resultado de média ponderada.
     */ 
    public static double doCalculationMediaPonderada(double primeitaNota, double n2) {
        return 0;        
    }

    public static void executarPlayground() {

        // Declarar as variaveis em escopo local.
        double n1, n2, n3, n4, m;

        // Criação de objeto de leitura de teclado.
        Scanner entrada = new Scanner(System.in);
        // Saída de dados simples
        // Este seria o [ ESCREVAL ]
        System.out.println("Digite as 4 notas do aluno.");
        // Este seria o [ ESCREVA ]
        System.out.print("Primeira nota");
        // Esta instrução seria o [ LEIA ]
        n1 = entrada.nextDouble();
        System.out.print("Segunda nota");
        n2 = entrada.nextDouble();
        System.out.print("Terceira nota");
        n3 = entrada.nextDouble();
        System.out.print("Quarta nota");
        n4 = entrada.nextDouble();

        m = (n1 + n2 + n3 + n4) / 4;

        /*
         * se (condicao) entao
         * instrucao
         * senao
         * instrucao
         * fimse
         */

        // O IF é o famoso [ SE ]
        if (m >= 7) { // A abertura do bloco é o [ ENTAO ]
            System.out.println("Aprovado");
        } else { // O fechamento deste bloco é o [ SENAO ]
            System.out.println("Reprovado");
        } // // O fechamento deste bloco é o [ FIMSE ]

        /*
         * A estrutura IF/ELSE representa as estrtuturas de controle [ SE/ENTAO/SENAO ].
         * Ela é uma estrutura em bloco ou seja; um grupo de instruções é executado
         * mediante a validação de uma expressão lógica, exatamente como já fizemos em
         * aula.
         */

        // Saída de dados formatada com 2 casas decimais.
        System.out.printf("A média é %.2f.\n", m);

        // Fechamento do objeto que realiza a leitura de dados via teclado.

        System.out.printf("{5 + 2 . [15 - (2⁴ : 8) + 3 . (2³ - 7)] - 3³} = %s\n",
                ((5 + 2 * (15 - (Math.pow(2, 4) / 8) + 3 * (Math.pow(2, 3) - 7)) - Math.pow(3, 3))));
        entrada.close();
        
    }
}

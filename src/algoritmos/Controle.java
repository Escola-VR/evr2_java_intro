package algoritmos;

import java.util.Scanner;

public class Controle {
    public static void executarPlayground() {
        int valor = 7;
        // TODO: SE/ENTAO

        /* SE */if (valor >= 5) { /* ENTAO */
            System.out.println("Aprovado.");
        } /* FIMSE */

        // TODO: SE/ENTAO/SENAO
        /* SE */if (valor >= 5) { /* ENTAO */
            System.out.println("Aprovado.");
        } else {/* SENAO */
            System.out.println("Reprovado");
        } /* FIMSE */

        // TODO: SE/ENTAO/SENAO aninhados
        if (valor < 5) {
            System.out.println("Reprovado");
        } else {
            if (valor < 7) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Aprovado");
            }
        }

        // TODO: ESCOLHA

        String caracter = "a";
        switch (caracter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("VOGAL");
                break;
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("ALGARISMO");
                break;
            default:
                System.out.println("Consoante ou caracter especial");
                break;
        }

        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        /*
         * Receber 3 valores referentes aos lados de 1 triangulo.
         * Validar os valores recebidos:
         * - Cada lado deve ser menor que soma dos outros 2 lados
         * Classificar o triangulo com as seguintes regras:
         * - 3 lados iguais: EQUILATERO
         * - 2 lados iguais: ISOSCELES
         * - 0 lados iguais: ESCALENO
         */

        System.out.println("Digite os 3 lados de triangulo.");
        System.out.print("A:");
        a = entrada.nextInt();
        System.out.print("B:");
        b = entrada.nextInt();
        System.out.print("C:");
        c = entrada.nextInt();

        // Olha o Fail First aqui
        if ((a < b + c) && (b < a + c) && (c < b + a)) {
            // TODO: definir o tipo
            if (a == b && a == c) {
                System.out.println("Equilátero");
            } else {
                if (a ==b || a == c || b == c) {
                    System.out.println("Isósceles");
                } else {
                    System.out.println("Escaleno");
                }
            }
        } else {
            // TODO: Exibir mensagem que os dados nao forma triangulo
            System.out.printf("%s, %s e %s não formam triangulo.\n", a, b, c);
        }

        entrada.close();

    }
}

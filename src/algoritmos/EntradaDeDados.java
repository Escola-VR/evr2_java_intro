package algoritmos;

import java.util.Scanner;

public class EntradaDeDados {

    String definicao = "A entrada de dados utilizada para algoritmos é a entrada padrão, ou seja  " +
            "teclado, para executarmos a leitura de dados via teclado precisamos de uma forma de \"ouvir\" " +
            "o teclado, existe uma classe que nos provê um objeto para este fim, a classe Scanner. \n" +
            "Iremos utilizar o Scanner para ler as entradas de dados.";

    public static void executarPlayground() {
        // Criação do objeto que executará a leitura
        Scanner entrada = new Scanner(System.in);

        System.out.println("Exemplo de entrada de dados do tipo texto(String).");

        System.out.println("Digite o seu nome");
        String nome = entrada.next();
        System.out.printf("%s é uma String? %b\n", nome, nome instanceof String);

        /*
         * O Scanner já possui os métodos para converter a entrada de dados.
         * A entrada de dados é uma String, logo teremos de converte-la para um tipo desejado.
         * O Scanner possui os métodos de conversão, o método next[TipoDeDado]() realiza a converão.
         */
        System.out.println("Exemplo de entrada de dados do tipo texto(String).");
        Integer inteiro = entrada.nextInt();

        // O statement instanceof verifica o tipo da variável após a conversão.
        System.out.printf("%s é um Integer? %b\n", inteiro, inteiro instanceof Integer);

        System.out.println(nome);
        System.out.println(inteiro);

        // Fechando o objeto de leitura da entrada padrão
        entrada.close();
    }
}

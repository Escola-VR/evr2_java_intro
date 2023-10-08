package algoritmos;

public class SaidaDeDados {
    public static void executarPlayground() {

        String definicao = "A saída de dados em algoritmos é diretamente associada ao console, " +
                "também associada como a saída padrão, a saída em vídeo.\n" +
                "Utilizamos 3 principais tipos de saídas: \n" +
                "1. Saída na mesma linha no exato ponto atual do cursor do console manteno o cursor na mesma posição.\n"
                +
                "2. Saída na posição atual do cursor e fazendo uma quebra de linha, ou seja levar o cursor para a linha abaixo após sua exibição."
                +
                "3. Saída de dados com expressões auxiliares à interpolação de dados.\n";

        System.out.println(definicao);

        String nome = "Ahsoka Tano ";
        String raca = "Togruta ";
        String autoDefinicao = "I am no Jedi";

        System.out.println("Tipo 1");
        System.out.print(nome);
        System.out.print(raca);
        System.out.print(autoDefinicao);

        System.out.println();

        System.out.println("\nTipo 2");
        System.out.println(nome);
        System.out.println(raca);
        System.out.println(autoDefinicao);

        System.out.println("\nTipo 3");
        /*
         * O printf aceita uma expressão de formatação e uma coleção de parametros que
         * será mesclada com o texto da expressão.
         * Por exemplo, iremos unir a 3 variáveis numa única saída de dados, mesclando
         * as variáveis.
         */
        // Objserve que o caracter % indica que neste ponto ele deverá ser substiuido
        // por um valor
        System.out.printf("Nome: %s\nRaça: %s\nAuto-definição: %s\n",
                nome, raca, autoDefinicao);
        // Os valores são indicados logo após a ',' e são substituidos na ordem a qual
        // foram informados.

        /*
         * Para gerar a mesma saída no tipo 2, teriamos de concatenar os dados numa
         * única String.
         * Concatenar é a junção de uma ou mais Strings com outros valores ou variáveis.
         * Observe o exemplo abaixo.
         */

        System.out.println("\nTipo 2: Concatenação - A");
        System.out.println("\nNome: " + nome); // Concatenação
        System.out.println("Raça: " + raca);
        System.out.println("Auto-definição: " + autoDefinicao);

        System.out.println("\nTipo 2: Concatenação - B");
        System.out.println("\nNome: " + nome + "\nRaça: " + raca + "\nAuto-definição: " + autoDefinicao);
    }
}

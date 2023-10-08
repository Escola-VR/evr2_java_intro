import java.util.Scanner;

import algoritmos.EntradaDeDados;
import algoritmos.Repeticao;
import algoritmos.SaidaDeDados;

public class App {

    static String global = "Variável Global";

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Tipos de dados numericos
        // Inteiros

        // Para declarar uma variavel em Java, nós utilizamos a sintaxe abaixo.
        // modificador tipo identificador = valor;
        // byte mByte = 127;
        

        // Saída de dados
        // escreval("Palmeiras ", t1, " X ", t2, "Corinthians")
        int t1 = 0, t2 = 0;
        // System.out.println("Palmeiras " + t1 + " X " + t1 + " Corinthians");

        // Entrada de dados:
        Scanner in = new Scanner(System.in);

        // System.out.println("Digite o placar.");
        // System.out.print("Palmeiras:");
        // t1 = in.nextInt(); //leia(t1)
        // System.out.print("Corinthians:");
        // t2 = in.nextInt(); //leia(t2)

        // C Style
        // System.out.printf("Palmeiras %d X %d Corinthians\n", t2, t1);


        // EntradaDeDados.executarPlayground();
        // SaidaDeDados.executarPlayground();
        Repeticao.executarPlayground();

        in.close();
    }
}

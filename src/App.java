import java.util.Scanner;

public class App {

    static String global = "Variável Global";

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Tipos de dados numericos
        // Inteiros

        // Para declarar uma variavel em Java, nós utilizamos a sintaxe abaixo.
        // modificador tipo identificador = valor;
        // byte mByte = 127;
        // System.out.printf("Byte: min[%s] - max[%s]\n", Byte.MIN_VALUE,
        // Byte.MAX_VALUE);
        // System.out.printf("Short: min[%s] - max[%s]\n", Short.MIN_VALUE,
        // Short.MAX_VALUE);
        // System.out.printf("Integer: min[%s] - max[%s]\n", Integer.MIN_VALUE,
        // Integer.MAX_VALUE);
        // System.out.printf("Long: min[%s] - max[%s]\n", Long.MIN_VALUE,
        // Long.MAX_VALUE);

        // System.out.printf("\nFloat: min[%s] - max[%s]\n", Float.MIN_VALUE,
        // Float.MAX_VALUE);
        // System.out.printf("Double: min[%s] - max[%s]\n", Double.MIN_VALUE,
        // Float.MAX_VALUE);

        // Saída de dados
        // escreval("Palmeiras ", t1, " X ", t2, "Corinthians")
        int t1 = 0, t2 = 0;
        // System.out.println("Palmeiras " + t1 + " X " + t1 + " Corinthians");

        // Entrada de dados:
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o placar.");
        System.out.print("Palmeiras:");
        t1 = in.nextInt(); //leia(t1)
        System.out.print("Corinthians:");
        t2 = in.nextInt(); //leia(t2)

        // C Style
        System.out.printf("Palmeiras %d X %d Corinthians\n", t2, t1);
        in.close();
    }
}

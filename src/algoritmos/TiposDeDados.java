package algoritmos;

public class TiposDeDados {

    public static void executarPlayground() {

        String definicao = "Os tipos de dados definem o escopo(limite) e as operações " + 
        "possíveis com o tipo, ou seja o tipo Byte tem o limte de armazenar apenas " + 
        "os valores de -128 a 127 equando o Short pode de -32.768 a 32.767.";

        System.out.println(definicao);
        System.out.println("Observe os tipos de dados abaixo assim como seus limite.");

        System.out.printf("Byte: min[%s] - max[%s]\n", Byte.MIN_VALUE,
        Byte.MAX_VALUE);
        System.out.printf("Short: min[%s] - max[%s]\n", Short.MIN_VALUE,
        Short.MAX_VALUE);
        System.out.printf("Integer: min[%s] - max[%s]\n", Integer.MIN_VALUE,
        Integer.MAX_VALUE);
        System.out.printf("Long: min[%s] - max[%s]\n", Long.MIN_VALUE,
        Long.MAX_VALUE);
        System.out.printf("\nFloat: min[%s] - max[%s]\n", Float.MIN_VALUE,
        Float.MAX_VALUE);
        System.out.printf("Double: min[%s] - max[%s]\n", Double.MIN_VALUE,
        Float.MAX_VALUE);
    }
}

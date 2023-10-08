package algoritmos;

// Criar a classe Repeticao no pacote alogoritmo
public class Repeticao {
   public static void executarPlayground() {

      System.out.println("FOR: PARA-FACA");
      // TODO: PARA-FACA
      /*
       * para i de 1 ate 10 passo 1 faca
       * escreval(i)
       * fimpara
       */
      for (int i = 0; i < 11; i++) { // FACA (i++): i <- i + 1
         System.out.println(i);
      } // FIMPARA

      // TODO: ENQUANTO-FACA
      /*
       * ENQUANTO(i < 11) FACA
       * i <- i + 1
       * escreval(i)
       * FIMENQUANTO
       */

      System.out.println("WHILE: ENQUANTO-FACA");
      int i = 0;
      while (i < 11) { // FACA
         i++;
         System.out.println(i);
      } // FIMENQUANTO

      System.out.println("REPITA-ATE: DO-WHILE");
      // TODO: REPITA ATE
      /*
       * REPITA
       * i <- i + 1
       * escreval(i)
       * ATE i > 10
       */

      int j = 0;
      do {
         j++;
         System.out.println(j);
      } while (j < 15);

      // TODO: HANDS ON
      /*
       * 1. Utilizando o FOR, exiba todos os multiplos
       * de 5 entre 0 e 1000.
       * 2. Utilizando o WHILE exiba as tabuadas do 1 ao 10.
       * 3. Utilizando o DO WHILE exiba as tabuadas do 5 ao 15.
       */

      System.out.println("\n\nExercício I\n");
      for (int z = 0; z < 11; z += 5) {
         System.out.println(z);
      }

      System.out.println("\n\nExercício II\n");
      i = 1;
      j = 1;
      while (i < 11) {
         j = 0;
         while (j < 11) {
            System.out.printf("%s X %s = %s\n", i, j, (i * j));
            j++;
         }
         i++;
         System.out.println();
      }

      System.out.println("\n\nExercício III\n");
      i = 1;
      j = 1;
      do {
         j = 0;
         do {
            System.out.printf("%s X %s = %s\n", i, j, (i * j));
            j++;
         } while (j < 11);
         i++;
         System.out.println();
      } while (i < 11);

   }
}

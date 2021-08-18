import jdk.javadoc.internal.tool.resources.javadoc;

/**
 * 0050014919 - João Pedro Barbosa Lobo
*/

public class Tabuada10{
   public static void main(String[] args){

      int j = 10;
      int aux = 0;
      System.out.println("Tabuada de " + j);

      for (int i = 0; i <= 10; i++){
         aux = j * i;
         System.out.print( j + " x " + i + " " + "=");
         System.out.println(" "+aux);
      }

   }
   
}

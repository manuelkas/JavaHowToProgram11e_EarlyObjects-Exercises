// Ejercicio 2.25: OddOrEven.java
// Escriba una aplicación que lea un entero y que determine e imprima
// si es impar o par [sugerencia: use el operador residuo.
// Un número par es un múltiplo de 2. Cualquier múltiplo de 2
// deja un residuo de 0 cuando se divide entre 2].
package Ch02.ex02_25;

import java.util.Scanner;

public class OddOrEven {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Ingresa el numero: ");
      int number = input.nextInt();

      if (number % 2 == 0){
         System.out.printf("%d es par", number);
      }

      if (number % 2 != 0){
         System.out.printf("%d es impar", number);
      }
   }
}

// Ejercicio 2.26: Multiples.java
// Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo
// del segundo e imprima el resultado. [Sugerencia: use el operador residuo].
package Ch02.ex02_26;

import java.util.Scanner;

public class Multiples {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Ingrese el primer entero: ");
      int number1 = input.nextInt();

      System.out.print("Ingrese el segundo entero: ");
      int number2 = input.nextInt();

      if (number1 % number2 == 0){
         System.out.printf("%d es multiplo de %d%n", number1, number2);
      }

      if (number1 % number2 != 0){
         System.out.printf("%d no es multiplo de %d%n", number1, number2);
      }
   }
}

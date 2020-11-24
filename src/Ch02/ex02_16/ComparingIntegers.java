// Ejercicio 2.16: ComparingIntegers.java
// Escriba una aplicacion que le pida al usuario ingresar dos enteros,
// los reciba y muestre el más grande, seguido de las palabras
// "es más grande". Si los números son iguales, imprima el mensaje
// "Estos números son iguales"
package Ch02.ex02_16;

import java.util.Scanner;

public class ComparingIntegers {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.printf("Ingrese el primer entero: ");
      int number1 = input.nextInt();
      System.out.printf("Ingrese el segundo entero: ");
      int number2 = input.nextInt();

      if(number1 > number2){
         System.out.printf("%d es mas grande.%n", number1);
      }

      if(number1 < number2){
         System.out.printf("%d es mas grande.%n", number2);
      }

      if(number1 == number2){
         System.out.printf("Estos numeros son iguales.%n");
      }
   }
}

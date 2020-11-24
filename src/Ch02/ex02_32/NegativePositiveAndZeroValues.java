// Ejercicio 2.32: NegativePositiveAndZeroValues.java
// Escriba un programa que reciba cinco números, y que determine e imprima
// la cantidad de números negativos, positivos, y la cantidad de ceros recibidos.
package Ch02.ex02_32;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.printf("Ingrese el primer numero: ");
      int number1 = input.nextInt();
      System.out.printf("Ingrese el segundo numero: ");
      int number2 = input.nextInt();
      System.out.printf("Ingrese el tercer numero: ");
      int number3 = input.nextInt();
      System.out.printf("Ingrese el cuarto numero: ");
      int number4 = input.nextInt();
      System.out.printf("Ingrese el quinto numero: ");
      int number5 = input.nextInt();

      int negative = 0;
      int positive = 0;
      int zeros = 0;

      if (number1 < 0){
         negative = negative + 1;
      }
      if (number2 < 0){
         negative = negative + 1;
      }
      if (number3 < 0){
         negative = negative + 1;
      }
      if (number4 < 0){
         negative = negative + 1;
      }
      if (number5 < 0){
         negative = negative + 1;
      }

      if (number1 > 0){
         positive = positive + 1;
      }
      if (number2 > 0){
         positive = positive + 1;
      }
      if (number3 > 0){
         positive = positive + 1;
      }
      if (number4 > 0){
         positive = positive + 1;
      }
      if (number5 > 0){
         positive = positive + 1;
      }

      if (number1 == 0){
         zeros = zeros + 1;
      }
      if (number2 == 0){
         zeros = zeros + 1;
      }
      if (number3 == 0){
         zeros = zeros + 1;
      }
      if (number4 == 0){
         zeros = zeros + 1;
      }
      if (number5 == 0){
         zeros = zeros + 1;
      }

      System.out.printf("Hay %d numeros negativos%n", negative);
      System.out.printf("Hay %d numeros positivos%n", positive);
      System.out.printf("Hay %d ceros%n", zeros);
   }
}

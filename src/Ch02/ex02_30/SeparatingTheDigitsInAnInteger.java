// Ejercicio 2.30: SeparatingTheDigitsInAnInteger.java
// Escriba una aplicación que reciba del usuario un número compuesto
// por cinco dígitos, que separe ese número en sus dígitos individuales
// y los imprima, cada uno separado de los demás por tres espacios.
// Por ejemplo, si el usuario escribe el número 42339, el programa debe imprimir
// 4   2   3   3   9
package Ch02.ex02_30;

import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero de 5 digitos: ");
        int number = input.nextInt();
        int digit5 = number % 10;
        number /= 10;
        int digit4 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number;

        System.out.printf("%d   %d   %d   %d   %d%n",
                digit1, digit2, digit3, digit4, digit5);
    }
}

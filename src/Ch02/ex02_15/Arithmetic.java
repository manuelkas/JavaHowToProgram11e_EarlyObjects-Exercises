// Ejercicio 2.15: Arithmetic.java
// Escriba una aplicacion que le pida al usuario ingresar dos enteros,
// los reciba e imprima su
// suma, producto, diferencia y cociente (division).
package Ch02.ex02_15;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer entero: ");
        int number1 = input.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int quotient = number1 / number2;

        System.out.printf("Suma = %d%n", sum);
        System.out.printf("Producto = %d%n", product);
        System.out.printf("Diferencia = %d%n", difference);
        System.out.printf("Cociente = %d%n", quotient);
    }
}

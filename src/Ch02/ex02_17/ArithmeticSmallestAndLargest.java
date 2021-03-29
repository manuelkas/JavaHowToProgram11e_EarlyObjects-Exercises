// Ejercicio 2.17: ArithmeticSmallestAndLargest.java
// Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
// promedio, producto, menor y mayor de esos números. Utilice las técnicas que
// se muestran en la figura 2.15
// [nota: el cálculo del promedio en este ejercicio debe dar como resultado
// una representación entera del promedio. Por lo tanto,
// si la suma de los valores es 7, el promedio debe ser 2, no 2.3333...]

package Ch02.ex02_17;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer entero: ");
        int number1 = input.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        int number2 = input.nextInt();

        System.out.print("Ingrese el tercer entero: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;

        int smallest = number1; // asigna number1 a smallest

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        int largest = number1; // asigna a largest el number1

        if (number2 > largest) { // si number2 es mayor que largest
            largest = number2; // largest es number2
        }

        if (number3 > largest) { // si number3 es mayor que largest
            largest = number3; // largest es number3
        }


        System.out.printf("La suma es %d%n", sum);
        System.out.printf("El promedio es %d%n", average);
        System.out.printf("El producto es %d%n", product);
        System.out.printf("El menor es %d%n", smallest);
        System.out.printf("El mayor es %d%n", largest);


    }
}

// Ejercicio 2.24: LargestAndSmallestIntegers.java
// Escriba una aplicación que lea cinco enteros y que determine
// e imprima los enteros mayor y menor en el grupo.
// Use solamente las técnicas de programación que aprendió en este capítulo.


package Ch02.ex02_24;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer entero: ");
        int number1 = input.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        int number2 = input.nextInt();

        System.out.print("Ingrese el tercer entero: ");
        int number3 = input.nextInt();

        System.out.print("Ingrese el cuarto entero: ");
        int number4 = input.nextInt();

        System.out.print("Ingrese el quinto entero: ");
        int number5 = input.nextInt();

        int largest = number1; // asigna a largest el number1
        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        if (number4 > largest) {
            largest = number4;
        }

        if (number5 > largest) {
            largest = number5;
        }

        int smallest = number1; // asinga a smallest el number1
        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number4 < smallest) {
            smallest = number4;
        }

        if (number5 < smallest) {
            smallest = number5;
        }

        System.out.printf("El mayor es %d%n", largest);
        System.out.printf("El menor es %d%n", smallest);
    }
}


// Exercise 4.38: Factorial.java
// Write an application that reads a nonnegative integer and computes and prints its factorial.


package Ch04.ex04_38;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int number = input.nextInt();
        int aux = number;
        int factorial = 1;


        while (aux > 1) {
            factorial *= aux--;
        }

        System.out.printf("%d! = %d", number, factorial);
    }
}
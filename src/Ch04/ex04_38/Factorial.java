// Exercise 4.38: Factorial.java
// Write an application that reads a nonnegative integer and computes and prints its factorial...

package Ch04.ex04_38;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        int aux = n; // creates a copy of the entered number to modify it in the execution of the app
        double factorial = 1.0; // initializes the factorial value to 1, since the factorial of 0 is 1

        while (aux > 1) { // while aux is greater than 1
            factorial *= aux--; // the factorial is multiplied by aux and then subtracted 1 from aux
        }

        System.out.printf("%d! = %.0f", n, factorial);
    }
}
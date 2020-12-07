// Exercise 4.36: SidesOfATriangle
// Write an application that reads three nonzero values entered by the user
// and determines and prints whether they could represent the sides of a triangle.

package Ch04.ex04_36;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first positive number: ");
        double a = input.nextDouble();
        System.out.print("Enter second positive number: ");
        double b = input.nextDouble();
        System.out.print("Enter third positive number: ");
        double c = input.nextDouble();

        if ((a + b) > c) {
            if ((a + c) > b) {
                if ((b + c) > a) {
                    System.out.println("These numbers could represent the sides of a triangle.");
                } else {
                    System.out.println("These numbers could not represent the sides of a triangle.");
                }
            } else {
                System.out.println("These numbers could not represent the sides of a triangle.");
            }
        } else {
            System.out.println("These numbers could not represent the sides of a triangle.");
        }
    }
}
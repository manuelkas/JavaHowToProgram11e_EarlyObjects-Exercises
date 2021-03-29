// Exercise 4.37: SidesOfARightTriangle
// Write an application that reads three nonzero integers and determines and
// prints whether they could represent the sides of a right triangle.
package Ch04.ex04_37;

import java.util.Scanner;

public class SidesOfARightTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first positive number: ");
        int a = input.nextInt();
        System.out.print("Enter second positive number: ");
        int b = input.nextInt();
        System.out.print("Enter third positive number: ");
        int c = input.nextInt();

        if ((a + b) > c) {
            if ((a + c) > b) {
                if ((b + c) > a) {
                    if ((a * a) == (b * b) + (c * c)) {
                        System.out.println("These numbers could represent the sides of a right triangle.");
                    } else if ((b * b) == (a * a) + (c * c)) {
                        System.out.println("These numbers could represent the sides of a right triangle.");
                    } else if ((c * c) == (a * a) + (b * b)) {
                        System.out.println("These numbers could represent the sides of a right triangle.");
                    } else {
                        System.out.println("These numbers could not represent the sides of a triangle.");
                    }
                } else {
                    System.out.println("These numbers could not represent the sides of a right triangle.");
                }
            } else {
                System.out.println("These numbers could not represent the sides of a right triangle.");
            }
        } else {
            System.out.println("These numbers could not represent the sides of a right triangle.");
        }
    }
}
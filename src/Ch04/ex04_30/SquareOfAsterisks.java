// Exercise 4.30:SquareOfAsterisks.java
// Write an application that prompts the user to enter the size of the side of a square,
// then displays a hollow square of that size made of asterisks.
// Your program should work for squares of all side lengths between 1 and 20.
package Ch04.ex04_30;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the side of the square to be drawn (1 to 20): ");
        int n = input.nextInt();
        int rows = 0;

        if (n < 1) {
            System.out.println("The size of the side of the square is shorter than the permitted size (1 - 20). Try again!");
        } else if (n > 20) {
            System.out.println("The size of the side of the square is larger than the permitted size (1 - 20). Try again!");
        } else {
            while (rows++ < n) {
                int columns = 0;
                while (columns++ < n) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

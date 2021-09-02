// Exercise 6.9: RoundingNumbers.java
// Math.floor can be used to round values to the nearest integer—e.g.,
// double y = Math.floor(x + 0.5); will round the number x to the nearest integer and assign the result to y.
// Write an application that reads double values and uses the preceding statement to round each of the numbers to the nearest
// integer. For each number processed, display both the original number and the rounded number.
package Ch06.ex06_09;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me an double value ( 0 to quit): ");
        double x = input.nextDouble();

        while (x != 0){
            double y = Math.floor(x + 0.5);
            System.out.printf("\tOriginal number: %f%n\tRounded number : %f%n", x, y);

            System.out.print("Give me an double value ( 0 to quit): ");
            x = input.nextDouble();
        }
    }
}

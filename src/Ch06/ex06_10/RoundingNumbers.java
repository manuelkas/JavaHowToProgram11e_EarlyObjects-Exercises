// Exercise 6.10: RoundingNumbers.java
// To round numbers to specific decimal places, use a statement like
//      double y = Math.floor(x * 10 + 0.5) / 10; which rounds x to the tenths position
// (i.e., the first position to the right of the decimal point), or
//      double y = Math.floor(x * 100 + 0.5) / 100; which rounds x to the hundredths position
// (i.e., the second position to the right of the decimal point).
// Write an application that defines four methods for rounding a number x in various ways:
//      a) roundToInteger(number)
//      b) roundToTenths(number)
//      c) roundToHundredths(number)
//      d) roundToThousandths(number)
// For each value read, your program should display the original value,
// the number rounded to the nearest integer, the number rounded to the nearest tenth,
// the number rounded to the nearest hundredth and the number rounded to the nearest thousandth.
package Ch06.ex06_10;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me an double value (0 to quit): ");
        double number = input.nextDouble();

        while (number != 0) {

            System.out.printf("\t                   Original number: %f%n", number);
            System.out.printf("\t    Rounded to the nearest integer: %.0f%n", roundToInteger(number));
            System.out.printf("\t      Rounded to the nearest tenth: %.1f%n", roundToTenths(number));
            System.out.printf("\t  Rounded to the nearest hundredth: %.2f%n", roundToHundredths(number));
            System.out.printf("\t Rounded to the nearest thousandth: %.3f%n", roundToTousandths(number));

            System.out.print("\nGive me an double value (0 to quit): ");
            number = input.nextDouble();
        }
    }

    // rounds to the nearest integer
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    // rounds to the nearest tenth
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // rounds to the nearest hundredth
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // rounds to the nearest thousandth
    public static double roundToTousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}

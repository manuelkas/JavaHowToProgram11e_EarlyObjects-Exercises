// Write an application that computes the value of e^x by using the
// following formula. Allow the user to enter the number of terms to
// calculate.
//   		e^x = 1 + (x / 1!) + (x² / 2!) + (x³ / 3!) + ...

package Ch04.ex04_38;

import java.util.Scanner;

public class ERaisedToX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        double eToX = 1.0; // e starts at 1
        int termsCounter = 1; // the term counter is also at zero

        if (terms >= 1) {
            while (termsCounter <= terms) { // only includes factorials from 1 to go through the terms from 1
                int auxCounter = termsCounter; // creates a copy of termsCounter to calculate factorial
                double factorial = 1.0; // initializes the factorial value to 1, since the factorial of 0 is 1
                while (auxCounter > 1) { // while auxCount is greater than 1
                    factorial *= auxCounter--; // the factorial is multiplied by aux and then subtracted 1 from aux
                }

                double result = 1.0;
                int acc = 1;

                while (acc <= termsCounter) {
                    result *= x;
                    acc++;
                }

                eToX += result / factorial;
                termsCounter++; // increases the termsCounter by 1
            }
            System.out.printf("e^%d = %f", x, eToX);
        }
    }
}

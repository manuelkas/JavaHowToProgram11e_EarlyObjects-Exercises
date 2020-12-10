// Exercise 4.38b: Econstant.java
// Write an application that estimates the value of the mathematical
// constant e by using the following formula. Allow the user to
// enter the number of terms to calculate.
// 		 e  = 1 + (1 / 1!) + (1 / 2!) + (1 / 3!) + ...
package Ch04.ex04_38;

import java.util.Scanner;

public class EConstant {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter number of terms: ");
      int terms = input.nextInt();

      double e = 1.0; // e starts at 1
      int termsCounter = 1; // the term counter is also at zero

      if (terms >= 1) {
         while (termsCounter <= terms) { // only includes factorials from 1 to go through the terms from 1
            int auxCounter = termsCounter; // creates a copy of termsCounter to calculate factorial
            double factorial = 1.0; // initializes the factorial value to 1, since the factorial of 0 is 1
            while (auxCounter > 1) { // while auxCount is greater than 1
               factorial *= auxCounter--; // the factorial is multiplied by aux and then subtracted 1 from aux
            }

            e += 1 / factorial;
            termsCounter++; // increases the termsCounter by 1
         }
         System.out.printf("e = %f", e);
      }
   }
}

// Exercise 4.32: BinaryToDecimal.java
// Write an application that inputs an integer containing only 0s and 1s (i.e., a binary integer)
// and prints its decimal equivalent. [Hint: Use the remainder and division operators to pick off
// the binary number’s digits one at a time, from right to left. In the decimal number system,
// the rightmost digit has a positional value of 1 and the next digit to the left a positional
// value of 10, then 100, then 1000, and so on. The decimal number 234 can be interpreted
// as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has a positional value of 1,
// the next digit to the left a positional value of 2, then 4, then 8, and so on.
// The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]

package Ch04.ex04_32;

import java.util.Scanner;

public class BinaryToDecimal {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number: ");
      int binary = input.nextInt();

      int position = 0; // saves the position of the end at the beginning of the binary number
      int decimal = 0; // will save the number in decimal

      // If there is still a number to operate with, greater than zero
      while (binary > 0){
         int digit = binary % 10; // saves the last digit to operate with it
         binary /= 10; // updates the value of the current one by dividing it by 10

         // will save the results of the power operations of two,
         // it is necessary that it is initialized in one because if it is in zero,
         // it will always be multiplied by zero, giving zero in almost all the results
         int result = 1;

         // If it is the 0 position from right to left, that is, the last digit of the binary
         if (position == 0){
            result = digit; // then the result is equal to the digit there
         }


         int i = 0; // variable to iterating
         while(i < position ){ // perform calculation of raising the digit * 2 to the position
            result *= digit * 2;
            i++; // increases the variable to continue iterating or stop
         }
         position++; // increases position
         decimal += result; // adds result to decimal value
      }
      System.out.printf("decimal = %d%n", decimal);
   }
}
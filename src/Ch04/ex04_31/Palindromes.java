// Exercise 4.31: Palindromes.java
// A palindrome is a sequence of characters that reads the same backward as forward.
// For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611.
// Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
// If the number is not five digits long, display an error message and allow the user to enter a new value.
package Ch04.ex04_31;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 100000;

        // Validate that number is five-digit
        while (number > 99999) { // first time number is > 99999, so enters the loop
            System.out.print("Enter a five-digit integer: ");
            number = input.nextInt();
            if (number < 10000) { // if number is less than 5 digits
                number = 100000; // so, number changes to more than 5 digits and enter the loop again
            }
        }

        int originalNumber = number;

        // if the first digit is the same as the last
        if (number / 10000 == number % 10) {
            number /= 10; // remove last digit
            number %= 1000; // remove first digit

            // if the first digit is the same as the last
            if (number / 100 == number % 10) {
                System.out.printf("%d is palindrome", originalNumber);
            }
        } else {
            System.out.printf("%d is not palindrome", originalNumber);
        }
    }
}
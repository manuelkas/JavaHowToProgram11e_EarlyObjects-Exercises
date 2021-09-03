// Exercise 6.21: SeparatingDigits.java
// Write methods that accomplish each of the following tasks:
//  a) Calculate the integer part of the quotient when integer a is divided by integer b.
//  b) Calculate the integer remainder when integer a is divided by integer b.
//  c) Use the methods developed in parts (a) and (b) to write a method displayDigits
//  that receives an integer between 1 and 99999 and displays it as a sequence of digits,
//  separating each pair of digits by two spaces. For example, the integer 4562 should appear as 4 5 6 2
// Incorporate the methods into an application that inputs an integer and calls displayDigits
// by passing the method the integer entered. Display the results.
package Ch06.ex06_21;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give an integer between 1 and 99999: ");
        int x = input.nextInt();
        displayDigits(x);
    }

    public static int calculateInQuotient(int a, int b){
        return a / b;
    }

    public static int calculateInRemainder(int a, int b){
        return a % b;
    }

    public static void displayDigits(int x){
        String digits = "";

        while (x > 0){
             int remainder = calculateInRemainder(x, 10);
             x = calculateInQuotient(x, 10);

             digits = String.format("%d  %s", remainder, digits);
        }
        System.out.println(digits);
    }
}

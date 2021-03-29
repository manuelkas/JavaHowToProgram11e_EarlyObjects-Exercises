// Excercise 5.11: FindTheSmallestValue.java
// Write an application that finds the smallest of several integers.
// Assume that the first value read specifies the number of values to input from the user.
package Ch05.ex05_11;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values to input: ");
        int totalValues = input.nextInt();

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= totalValues; i++) {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();

            if (n < smallest) {
                smallest = n;
            }
        }

        if (totalValues > 0)
            System.out.printf("%nSmallest is %d", smallest);
        else
            System.out.println("\nNo values were entered");
    }
}

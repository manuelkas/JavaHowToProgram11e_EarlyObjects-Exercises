// Exercise 5.13: Factorials.java
// Factorials are used frequently in probability problems.
// The factorial of a positive integer n (written n! and pronounced “n factorial”)
// is equal to the product of the positive integers from 1 to n.
// Write an application that calculates the factorials of 1 through 20.
// Use type long. Display the results in tabular format.
// What difficulty might prevent you from calculating the factorial of 100?
package Ch05.ex05_13;

public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;

        for (int i = 1; i <= 20; i++){
            factorial *= i;
            System.out.printf("%2d! = %d%n", i, factorial);
        }

    }
}

// Exercise 5.12: CalculatingTheProductOfOddIntegers.java
// Write an application that calculates the product of the odd integers from 1 to 15.
package Ch05.ex05_12;

public class CalculatingTheProductOfOddIntegers {
    public static void main(String[] args) {
        int totalProduct = 1;

        for (int i = 1; i <= 15; i += 2){
            totalProduct *= i;
        }

        System.out.printf("The product of the odd integers from 1 to 15 is: %,d%n", totalProduct);
    }
}

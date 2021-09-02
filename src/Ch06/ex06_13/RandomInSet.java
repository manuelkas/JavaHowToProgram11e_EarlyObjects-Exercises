// Exercise 6.13: RandomInSet.java
// Write statements that will display a random number from each of the following sets:
//  a) 0, 3, 6, 9, 12.
//  b) 1, 2, 4, 8, 16, 32.
//  c) 10, 20, 30, 40.
package Ch06.ex06_13;
import java.security.SecureRandom;

public class RandomInSet {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Random numbers in sets");
        System.out.printf("set {0, 3, 6, 9, 12}    : %d%n", 3 * randomNumbers.nextInt(5));
        System.out.printf("set {1, 2, 4, 8, 16, 32}: %d%n", (int)Math.pow(2, randomNumbers.nextInt(6)));
        System.out.printf("set {10, 20, 30, 40}    : %d%n", 10 + 10 * randomNumbers.nextInt(4));
    }
}

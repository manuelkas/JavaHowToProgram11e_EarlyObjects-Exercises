// Exercise 6.12: RandomIntegers.java
// Write statements that assign random integers to the variable n in the following ranges:
//  a) 2 ≤ n ≤ 6.
//  b) 4 ≤ n ≤ 50.
//  c) 0 ≤ n ≤ 7.
//  d) 1000 ≤ n ≤ 1030.
//  e) –5 ≤ n ≤ 1.
//  f) –2 ≤ n ≤ 9.
package Ch06.ex06_12;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Random numbers");
        System.out.println("|----- Range -----|" +
                "|------------------------- numbers -------------------------|");

        System.out.printf("%19s", "2 ≤ n ≤ 6     ");
        // loop 10 times
        for (int i = 1; i <= 10; i++) {
            // pick random integer from 1 to 6
            int number = 2 + randomNumbers.nextInt(5);
            System.out.printf("%6d", number); // display generated value
            }

        System.out.printf("%n%19s", "4 ≤ n ≤ 50    ");
        for (int i = 1; i <= 10; i++) {
            // pick random integer from 1 to 6
            int number = 4 + randomNumbers.nextInt(47);
            System.out.printf("%6d", number); // display generated value
        }

        System.out.printf("%n%19s", "0 ≤ n ≤ 7     ");
        for (int i = 1; i <= 10; i++) {
            // pick random integer from 1 to 6
            int number = randomNumbers.nextInt(8);
            System.out.printf("%6d", number); // display generated value
        }

        System.out.printf("%n%19s", "1000 ≤ n ≤ 1030  ");
        for (int i = 1; i <= 10; i++) {
            // pick random integer from 1 to 6
            int number = 1000 + randomNumbers.nextInt(31);
            System.out.printf("%6d", number); // display generated value
        }

        System.out.printf("%n%19s", "-5 ≤ n ≤ 1     ");
        for (int i = 1; i <= 10; i++) {
            // pick random integer from 1 to 6
            int number = -5 + randomNumbers.nextInt(7);
            System.out.printf("%6d", number); // display generated value
        }

        System.out.printf("%n%19s", "-2 ≤ n ≤ 9     ");
        for (int i = 1; i <= 10; i++) {
            // pick random integer from 1 to 6
            int number = -2 + randomNumbers.nextInt(12);
            System.out.printf("%6d", number); // display generated value
        }




    }
}

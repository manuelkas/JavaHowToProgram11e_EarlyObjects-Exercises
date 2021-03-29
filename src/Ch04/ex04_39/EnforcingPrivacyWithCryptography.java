// Exercise 4.39: EnforcingPrivacyCryptography.java
// Your application should read a four-digit integer entered by the user and encrypt it as follows:
// Replace each digit with the result of adding 7 to the digit and getting the remainder
// after dividing the new value by 10. Then swap the first digit with the third,
// and swap the second digit with the fourth. Then print the encrypted integer.
// Write a separate application that inputs an encrypted four-digit integer and decrypts it
// (by reversing the encryption scheme) to form the original number.
package Ch04.ex04_39;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a four-digit integer to encrypt it: ");
        int number = input.nextInt();

        // get the digits
        int digit4 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number;

        // decrypt the digits
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        // swap the digits
        int aux;
        aux = digit1;
        digit1 = digit3;
        digit3 = aux;
        aux = digit2;
        digit2 = digit4;
        digit4 = aux;

        System.out.printf("The encrypted integer is %d%d%d%d%n", digit1, digit2, digit3, digit4);
    }
}

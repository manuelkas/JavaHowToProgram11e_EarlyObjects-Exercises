// Write a separate application that inputs an encrypted four-digit integer and decrypts it
// (by reversing the encryption scheme) to form the original number.
package Ch04.ex04_39;

import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a four-digit integer to decrypt: ");
        int number = input.nextInt();

        // get the digits
        int digit4 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number;

        // encrypt the digits
        digit1 = (digit1 + 3) % 10;
        digit2 = (digit2 + 3) % 10;
        digit3 = (digit3 + 3) % 10;
        digit4 = (digit4 + 3) % 10;

        // swap the digits
        int aux;
        aux = digit1;
        digit1 = digit3;
        digit3 = aux;
        aux = digit2;
        digit2 = digit4;
        digit4 = aux;

        System.out.printf("The original integer is %d%d%d%d%n", digit1, digit2, digit3, digit4);
    }
}

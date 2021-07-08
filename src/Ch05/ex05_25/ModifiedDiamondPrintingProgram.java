// Exercise 5.25: ModifiedDiamondPrintingProgram.java
// Modify the application you wrote in Exercise 5.24 to read an odd number
// in the range 1 to 19 to specify the number of rows in the diamond.
// Your program should then display a diamond of the appropriate size.

package Ch05.ex05_25;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {

        int rows;
        do
        {
            System.out.print("Enter the number of rows (odd and be between 1 and 19): ");
            Scanner input = new Scanner(System.in);
            rows = input.nextInt();
        }
        // validates the number of rows
        while ((rows < 1) || (rows > 19) || (rows % 2 == 0));

        // First half design
        for (int i = 1; i <= rows; i = i + 2) {

            for (int j = rows; j > i; j = j - 2)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // Second half design
        for (int i = 1; i <= rows; i = i + 2) {
            for (int j = 1; j <= i; j = j + 2)
                System.out.print(" ");
            for (int j = rows - 2; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}

// Exercise 5.24: DiamondPrintingProgram.java
// Write an application that prints the following diamond shape.
//
//         *
//        ***
//       *****
//      *******
//     *********
//      *******
//       *****
//        ***
//         *
//
// You may use output statements that print a single asterisk (*), a single space or a single new-line character.
// Maximize your use of iteration (with nested for statements), and minimize the number of output statements.
package Ch05.ex05_24;

public class DiamondPrintingProgram {
    public static void main(String[] args) {

        // First half design
        for (int i = 1; i <= 9; i = i + 2) {

            for (int j = 9; j > i; j = j - 2)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // Second half design
        for (int i = 1; i <= 9; i = i + 2) {
            for (int j = 1; j <= i; j = j + 2)
                System.out.print(" ");
            for (int j = 7; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}


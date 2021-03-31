// Exercise 5.22: ModifiedTrianglePrintingProgram.java
// Modify Exercise 5.15 to combine your code from the four separate triangles of asterisks
// such that all four patterns print side by side.
// [Hint: Make clever use of nested for loops.]
package Ch05.ex05_22;

public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // First Asterisk Design
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 10; j > i; j--)
                System.out.print(" ");

            System.out.print(" "); // Space between designs

            // Second Asterisk Design
            for (int j = 10; j >= i; j--)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print(" ");

            System.out.print(" ");

            // Third Asterisk Design
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int j = 10; j >= i; j--)
                System.out.print("*");

            System.out.print(" ");

            // Fourth Asterisk Design
            for (int j = 10; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

// Exercise 2.14: OneToFour.java
// Write an application that displays the numbers 1 to 4
// on the same line, with each pair of adjacent numbers
// separated by one space. Use the following techniques:
//     Use one System.out.println statement.
//     Use four System.out.print statements.
//     Use one System.out.printf statement.
package Ch02.ex02_14;

public class OneToFour {
    // main method begins execution of Java application
    public static void main(String[] args) {
        System.out.println("1 2 3 4");

        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");

        System.out.printf("%s%n", "1 2 3 4");
    }
}
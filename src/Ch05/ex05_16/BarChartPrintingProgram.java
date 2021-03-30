// Exercise 5.16: BarCharPrintingProgram.java
// One interesting application of computers is to display graphs and bar charts.
// Write an application that reads five numbers between 1 and 30.
// For each number that’s read, your program should display the same number of adjacent asterisks.
// For example, if your program reads the number 7, it should display *******.
// Display the bars of asterisks after you read all five numbers.
package Ch05.ex05_16;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, n5;

        System.out.println("Give five numbers between 1 and 30: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();

        System.out.println();
        printBar(n1);
        printBar(n2);
        printBar(n3);
        printBar(n4);
        printBar(n5);

    }

    public static void printBar(int length) {

        for (int i = 0; i < length; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}

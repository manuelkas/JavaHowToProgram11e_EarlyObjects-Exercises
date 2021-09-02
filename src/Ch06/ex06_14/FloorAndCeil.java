// Exercise 6.14: FloorAndCeil.java
// Write two methods myFloor and myCeil that take a positive double num
// variable int myFloor(double num) and int myCeil(double num).
// The myFloor method takes num and returns the largest integer number that is less than or equal to x.
// The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
// not use any Math class methods. Incorporate this method into an application that sends a double
// value to the functions and tests their ability to calculate the required output.
package Ch06.ex06_14;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me an positive number: ");
        double num = input.nextDouble();

        System.out.printf("The largest integer that is less than or equal to %f is %d%n", num, myFloor(num));
        System.out.printf("The smallest integer that is greater than or equal to %f is %d%n", num, myCeil(num));
    }

    public static int myFloor(double num) {
        // Converts to integer by truncating the decimal part
        return (int) num;
    }

    public static int myCeil(double num) {
        // if the number is greater than the number converted to integer
        if (num > (int) num) {
            // adds 1 to get the following integer
            num += 1;
        }
        // And returns that integer by truncating the decimal part
        return (int) (num);
    }
}

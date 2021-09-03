// Exercise 6.20: TestForLeapYear.java
// Write an application that prompts the user to enter a year and uses a
// called isLeapYear to check whether it is a leap year.
package Ch06.ex06_20;

import java.util.Scanner;

public class TestForLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a year after 1582: ");
        int year = input.nextInt();

        if (isLeapYear(year)){
            System.out.printf("%d IS a leap year", year);
        }
        else {
            System.out.printf("%d IS NOT a leap year", year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year > 1582) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
        return year % 4 == 0;
    }
}

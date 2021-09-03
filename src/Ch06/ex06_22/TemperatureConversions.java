// Exercise 6.22: TemperatureConversions.java
// Implement the following integer methods:
// Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation
//      celsius = 5.0 / 9.0 * (fahrenheit - 32);
// Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation
//      fahrenheit = 9.0 / 5.0 * celsius + 32;
// Use the methods from parts (a) and (b) to write an application that enables the user either
// to enter a Fahrenheit temperature and display the Celsius equivalent
// or to enter a Celsius temperature and display the Fahrenheit equivalent.

package Ch06.ex06_22;

import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte option;

        do {
            System.out.printf("Do you want to convert from: " +
                    "%n1. ªF to ªC" +
                    "%n2. ªC to ªF%n" +
                    "?__");
            option = input.nextByte();
        } while(1 > option || 2 < option);


        if (option == 1){
            System.out.print("ªF: ");
            double x = input.nextDouble();
            System.out.printf("%.2f ªC", celsius(x));
        }
        else {
            System.out.print("ªC: ");
            double x = input.nextDouble();
            System.out.printf("%.2f ªF", fahrenheit(x));
        }
    }

    // returns the Celsius equivalent of a Fahrenheit temperature
    public static double celsius (double fahrenheit){
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // returns the Fahrenheit equivalent of a Celsius temperature
    public static double fahrenheit (double celsius){
        return 9.0 / 5.0 * celsius + 32;
    }
}
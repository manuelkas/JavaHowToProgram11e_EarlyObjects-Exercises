// Exercise 6.15: HypotenuseCalculations.java
// Define a method hypotenuse that calculates the hypotenuse of
// a right triangle when the lengths of the other two sides are given. The method should take two ar-
// guments of type double and return the hypotenuse as a double. Incorporate this method into an
// application that reads values for side1 and side2 and performs the calculation with the hypotenuse
// method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
// triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]
// Triangle    side1    side2
//     1        3.0     4.0
//     2        5.0     12.0
//     3        8.0     15.0
package Ch06.ex06_15;

public class HypotenuseCalculatios {
    public static void main(String[] args) {

        double side1 = 3.0;
        double side2 = 4.0;
        System.out.printf("Triangle 1: side1 = %.1f  side2 = %.1f  hypotenuse = %.1f%n",
                side1, side2, hypotenuse(side1, side2));

        side1 = 5.0;
        side2 = 12.0;
        System.out.printf("Triangle 2: side1 = %.1f  side2 = %.1f  hypotenuse = %.1f%n",
                side1, side2, hypotenuse(side1, side2));

        side1 = 8.0;
        side2 = 15.0;
        System.out.printf("Triangle 2: side1 = %.1f  side2 = %.1f  hypotenuse = %.1f%n",
                side1, side2, hypotenuse(side1, side2));
    }

    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}

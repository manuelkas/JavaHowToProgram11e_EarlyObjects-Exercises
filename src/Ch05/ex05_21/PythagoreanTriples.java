// Exercise 5.21: PythagoreanTriples.java
// A right triangle can have sides whose lengths are all integers.
// The set of three integer values for the lengths of the sides of
// a right triangle is called a Pythagorean triple.
// The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
// sides is equal to the square of the hypotenuse. Write an application that displays a table of the
// Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested
// for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
// learn in more advanced computer science courses that for many interesting problems there’s no
// known algorithmic approach other than using sheer brute force.
package Ch05.ex05_21;

public class PythagoreanTriples {
    public static void main(String[] args) {

        System.out.printf("%5s %5s %5s%n", "a", "b", "c");

        for (int a = 1; a <= 500; a++){
            for (int b = 1; b <= 500; b++){
                for (int c = 1; c <= 500; c++){

                    if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) && (a < b)){

                        System.out.printf("%5d %5d %5d%n", a, b, c);

                    }
                }
            }
        }
    }
}

// Exercise 4.34: MultiplesOf2WithInfiniteLoop.java
// (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying
// in the command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on.
// Your loop should not terminate (i.e., it should create an infinite loop).
// -What happens when you run this program?

package Ch04.ex04_34;

public class MultiplesOf2WithInfiniteLoop {
    public static void main(String[] args) {

        int n = 1;
        while (n > 0) {
            n *= 2;
            System.out.printf("%d%n", n);
        }
    }
}

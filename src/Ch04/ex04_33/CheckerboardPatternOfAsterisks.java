// Exercise 4.33: CheckerboardPatternOfAsterisks.java
// Write an application that uses only the output statements
//
//    1   System.out.print("* ");
//    2   System.out.print(" ");
//    3   System.out.println();
//
// to display the checkerboard pattern that follows. A System.out.println method call with no arguments
// causes the program to output a single newline character. [Hint: Iteration statements are required.]
//
//* * * * * * * *
// * * * * * * * *
//* * * * * * * *
// * * * * * * * *
//* * * * * * * *
// * * * * * * * *
//* * * * * * * *
// * * * * * * * *
package Ch04.ex04_33;

public class CheckerboardPatternOfAsterisks {
   public static void main(String[] args) {

      int i = 0;

      while (i++ < 8) {
         int j = 0;
         while (j++ < 8) {
            System.out.print("* ");
         }

         System.out.println();
         if (i % 2 == 1) {
            System.out.print(" ");
         }
      }
   }
}

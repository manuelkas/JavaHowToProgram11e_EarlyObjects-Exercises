// Exercise 5.23: DeMorgansLaws.java
// In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !.
// De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
// These laws state that the expression !(condition1 && condition2) is logically equivalent to the
// expression (!condition1 || !condition2). Also, the expression !(condition1 || condition2) is logically
// equivalent to the expression (!condition1 && !condition2).
// Use De Morgan’s laws to write equivalent expressions for each of the following,
// then write an application to show that both the original
// expression and the new expression in each case produce the same value:
//  a) !(x < 5) && !(y >= 7)
//  b) !(a == b) || !(g != 5)
//  c) !((x <= 8) && (y > 4))
//  d) !((i > 4) || (j <= 6))

package Ch05.ex05_23;

public class DeMorgansLaws {
    public static void main(String[] args) {
        // Values to test
        int x = 6;
        int y = 7;
        int a = 9;
        int b = 5;
        int g = 9;
        int i = 10;
        int j = 2;

        System.out.println("All variables have value of 5 to compare expressions.\n");

        // Exercise a)
        System.out.println("Exercise A");
        System.out.printf("!(x < 5) && !(y >= 7):\t\t%b%n", !(x < 5) && !(y >= 7));
        System.out.printf("(x >= 5) || (y < 7):\t\t%b%n%n", !((x >= 5) || (y < 7)));

        // Exercise b)
        System.out.println("Exercise B");
        System.out.printf("!(a == b) || !(g != 5):\t\t%b%n", !(a == b) || !(g != 5));
        System.out.printf("!((a == b) && (g != 5)):\t%b%n%n", !((a == b) && (g != 5)));

        // Exercise c)
        System.out.println("Exercise C");
        System.out.printf("!((x <= 8) && (y > 4)):\t\t%b%n", !((x <= 8) && (y > 4)));
        System.out.printf("!(x <= 8) || !(y > 4):\t\t%b%n%n", !(x <= 8) || !(y > 4));

        // Exercise d)
        System.out.println("Exercise D");
        System.out.printf("!((i > 4) || (j <= 6)):\t\t%b%n", !((i > 4) || (j <= 6)));
        System.out.printf("!( i > 4) && !(j < = 6):\t%b%n", !(i > 4) && !(j <= 6));
    }
}

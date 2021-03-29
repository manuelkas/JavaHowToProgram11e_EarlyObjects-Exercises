// Exercise 4.22: TabularOutput.java
// Write a Java application that uses looping to print the following table of values:
//
//N       10*N    100*N   1000*N
//1       10      100     1000
//2       20      200     2000
//3       30      300     3000
//4       40      400     4000
//5       50      500     5000

package Ch04.ex04_22;

public class TabularOutput {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("N       10*N    100*N    1000*N");

        while (n <= 5) {
            System.out.printf("%d       %d      %d      %d%n", n, n * 10, n * 100, n * 1000);
            n++;
        }
    }
}

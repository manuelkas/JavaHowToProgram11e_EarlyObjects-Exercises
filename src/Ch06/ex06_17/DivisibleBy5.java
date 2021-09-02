// Exercise 6.17: DivisibleBy5.java
// Write a method isDivisible that uses the remainder operator (%) to deter-
// mine whether ten input integers are divisible by 5 or not. The method should take an integer argu-
// ment and return true if the integer is divisible by 5 and false otherwise. Incorporate this method
// into an application that inputs a sequence of integers (one at a time) and determines the result.
package Ch06.ex06_17;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me ten integers, press ENTER after input each one");

        for (int i = 0; i < 10; i++){
            int x = input.nextInt();

            if (isDivisible(x)){
                System.out.printf("%d IS divisible by 5%n", x);
            }
            else{
                System.out.printf("%d IS NOT divisible by 5%n", x);
            }
        }
    }

    public static boolean isDivisible(int x){
        return x % 5 == 0;
    }
}

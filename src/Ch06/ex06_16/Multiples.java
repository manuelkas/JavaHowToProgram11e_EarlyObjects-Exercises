// Exercise 6.16: Write a method isMultiple that determines, for a pair of integers, whether the
// second integer is a multiple of the first. The method should take two integer arguments and return
// true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
// Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
// time) and determines whether the second value in each pair is a multiple of the first.

package Ch06.ex06_16;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many series of pairs of integers?: ");
        int counter = input.nextInt();

        for(int i = 0; i < counter; i++){
            System.out.print("Give me the pair: ");
            int a = input.nextInt();
            int b = input.nextInt();

            while (a == 0){
                System.out.print("It is not possible to divide by zero. \nGive me a valid pair: ");
                a = input.nextInt();
                b = input.nextInt();
            }

            if (isMultiple(a, b)){
                System.out.printf("%d IS a multiple of %d%n", b, a);
            }
            else{
                System.out.printf("%d IS NOT multiple of %d%n", b, a);
            }
        }
    }

    public static boolean isMultiple(int a, int b){
        return b % a == 0;
    }
}

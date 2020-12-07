package Ch04.ex04_38;

import java.util.Scanner;

public class EConstant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        double e = 0.0;
        int termsCounter = 0;


        while (termsCounter <= terms) {

            int auxCounter = termsCounter;
            double factorial = 1;
            while (auxCounter >= 1) {
                factorial *= auxCounter--;
            }

            e += 1 / factorial;
            termsCounter++;
        }

        System.out.printf("e = %f", e);
    }
}

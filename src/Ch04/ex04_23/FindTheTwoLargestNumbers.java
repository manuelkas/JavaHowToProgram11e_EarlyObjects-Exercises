// Exercise 4.23: FIndTheTwoLargestNumbers.java
// Using an approach similar to that for Exercise 4.21 , find the two largest values
// of the 10 values entered. [Note: You may input each number only once.]
package Ch04.ex04_23;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int largest = number; // The first number will be the largest
        int secondLargest = 0;

        while (counter < 10) {

            System.out.print("Enter the number: ");
            number = input.nextInt();
            counter++;

            if (number > largest) {  // if the new number is larger than largest so far
                secondLargest = largest; // largest will be secondLargest and
                largest = number; // the largest now is number

            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.printf("The largest integer found so far is: %d%n", largest);
        System.out.printf("The second largest integer found so far is: %d%n", secondLargest);
    }
}


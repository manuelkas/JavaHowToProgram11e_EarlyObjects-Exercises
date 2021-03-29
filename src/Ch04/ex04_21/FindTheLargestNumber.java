// Exercise 4.21: FindTheLargestNumber.java
// The process of finding the largest value is used frequently in computer applications.
// For example, a program that determines the winner of a sales contest would input the number
// of units sold by each salesperson. The salesperson who sells the most units wins the contest.
// Write a pseudocode program, then a Java application that inputs a series of 10 integers and
// determines and prints the largest integer. Your program should use at least the following three variables:
//      counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input and
//      to determine when all 10 numbers have been processed).
//      number: The integer most recently input by the user.
//      largest: The largest number found so far.
package Ch04.ex04_21;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int largest = number; // The first number will be the largest

        while (counter < 10) {

            System.out.print("Enter the number: ");
            number = input.nextInt();
            counter++;

            if (number > largest) {  // if the new number is larger than largest so far
                largest = number; // the largest now is number
            }
        }
        System.out.printf("The largest integer found so far is: %d%n", largest);
    }
}

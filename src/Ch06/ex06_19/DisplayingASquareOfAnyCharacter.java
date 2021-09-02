// Exercise 9.19: DisplayingASquareOfAnyCharacter.java
// Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter.
// Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #,
// the method should display
//  #####
//  #####
//  #####
//  #####
//  #####
// Use the following statement (in which input is a Scanner object) to read a character from the user
// at the keyboard:
//  next() returns a String and charAt(0) gets the String's first character
//  char fill = input.next().charAt(0);
package Ch06.ex06_19;

import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give me the size of side followed from the fill character: ");
        int side = input.nextInt();
        char fill = input.next().charAt(0);

        squareOfAnyCharacter(side, fill);
    }

    public static void squareOfAnyCharacter(int side, char fillCharacter){
        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

}

// Exercise 5.29: TheTwelveDaysOfChristmasSong.java
// Write an application that uses iteration and switch statements to print the song
// "The Twelve Days of Christmas." One switch statement should be used to print the day ("first", "second", and so on).
// A separate switch statement should be used to print the remainder of each verse.
// Visit the website en.wikipedia.org/wiki/The_Twelve_Days_ of_Christmas_(song) for the lyrics of the song.
package Ch05.ex05_29;

public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.print("\nOn the ");
            switch (i) {
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default:
                    break;
            }
            System.out.print("day of Christmas,\nMy true love sent to me");

            // omit break statements so results cascade
            // countdown to avoid extra entries
            switch (i) {
                case 12:
                    System.out.print("\nTwelve Drummers Drumming,");
                case 11:
                    System.out.print("\nEleven Pipers Piping,");
                case 10:
                    System.out.print("\nTen Lords a-Leaping,");
                case 9:
                    System.out.print("\nNine Ladies Dancing,");
                case 8:
                    System.out.print("\nEight Maids a-Milking,");
                case 7:
                    System.out.print("\nSeven Swans a-Swimming,");
                case 6:
                    System.out.print("\nSix Geese a-Laying,");
                case 5:
                    System.out.print("\nFive Gold Rings,");
                case 4:
                    System.out.print("\nFour Calling Birds,");
                case 3:
                    System.out.print("\nThree French Hens,");
                case 2:
                    System.out.print("\nTwo Turtle Doves, and");
                case 1:
                    System.out.print("\nA Partridge in a Pear Tree.\n");
            }
        }
    }
}
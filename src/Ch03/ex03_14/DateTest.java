// Write a test app named DateTest that demonstrates class Date’s capabilities.
package Ch03.ex03_14;

public class DateTest {
    public static void main(String[] args) {
        // create Date object
        Date date = new Date(3, 29, 2020);

        // call displayDate from date object
        date.displayDate();

        date.setMonth(12);
        date.setDay(16);
        date.setYear(2019);

        date.displayDate();
    }
}

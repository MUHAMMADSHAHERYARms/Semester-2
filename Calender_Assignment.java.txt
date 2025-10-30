import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calender_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        DayOfWeek startDay = firstDay.getDayOfWeek();


        int totalDays = firstDay.lengthOfMonth();

        System.out.println("\nCalendar for the month of " + firstDay.getMonth() + ", " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");


        int startValue = startDay.getValue();
        int spaces = startValue % 7;


        for (int i = 0; i < spaces; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%2d ", day);


            if ((day + spaces) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}




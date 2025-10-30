package practice_oop_by_gpt_5;
//ASSALAM O ALAIKUM
//        QUESTION:
//        Write a java program that takes input year and month from the user and prints a calendar of that month. For example if the user enters 2026 for year and 4 for the month then your program should print the following;
//
//        EXPECTED OUTPUT:Calendar for the month of April, 2026
//
 //Su Mo Tu  We Th Fr  Sa
//             1  2  3  4
//  5  6  7  8  9  10  11
// 12  13 14 15 16 17  18
// 19  20  21 22 23 24 25
// 26  27  28 29  30
//
//        HINTS:import java.time.DayOfWeek;
//import java.time.LocalDate;
//LocalDate LdNow = LocalDate.of(year, month, day);    
//        DayOfWeek dofw = LdNow.getDayOfWeek();
//


//import java.time.LocalDate;
//import java.util.Scanner;
//import java.time.DayOfWeek;
//public class Calender_User_Input {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        int year = sc.nextInt();
//        System.out.println("You Entered month" + month + "You entered year" + year);
//        LocalDate ldNow = LocalDate.ofYearDay(year, month );
//        enum Day {
//            Su,Mo,Tu,We,Th,Fr,Sa
//        }
//        Day d1 = Day.Su;
//        Day d2 = Day.Mo;
//        Day d3 = Day.Tu;
//        Day d4 = Day.We;
//        Day d5 = Day.Th;
//        Day d6 = Day.Fr;
//        Day d7 = Day.Sa;
//        System.out.print(d1);
//        System.out.print(d2);
//        System.out.print(d3);
//        System.out.print(d4);
//        System.out.print(d5);
//        System.out.print(d6);
//        System.out.print(d7);
//
//        DayOfWeek dofw = ldNow.getDayOfWeek();
//        System.out.println(ldNow);
//        System.out.println(dofw);
//
//    }
//}


import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

class Calendar_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: User input
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Step 2: Create date of 1st day of that month
        LocalDate firstDay = LocalDate.of(year, month, 1);
        DayOfWeek startDay = firstDay.getDayOfWeek();

        // Step 3: Find total days in month
        int daysInMonth = firstDay.lengthOfMonth();

        // Step 4: Print header
        System.out.println("\nCalendar for the month of " + firstDay.getMonth() + ", " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Step 5: Print starting spaces
        int value = startDay.getValue(); // Monday=1, Sunday=7
        int spaces = (value % 7); // Sunday = 0
        for (int i = 0; i < spaces; i++) {
            System.out.print("   "); // 3 spaces
        }

        // Step 6: Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + spaces) % 7 == 0) {
                System.out.println(); // next line after Saturday
            }
        }

        System.out.println(); // final new line
        sc.close();
    }
}

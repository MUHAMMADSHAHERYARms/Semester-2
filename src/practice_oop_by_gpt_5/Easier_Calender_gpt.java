package practice_oop_by_gpt_5;


import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;
public class Easier_Calender_gpt {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // --- Step 1: Take input ---
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();

            // --- Step 2: Find 1st day of the month ---
            LocalDate firstDay = LocalDate.of(year, month, 1);
            DayOfWeek startDay = firstDay.getDayOfWeek();

            // --- Step 3: Find how many days are in the month ---
            int totalDays = firstDay.lengthOfMonth();

            // --- Step 4: Print heading ---
            System.out.println("\nCalendar for the month of " + firstDay.getMonth() + ", " + year);
            System.out.println("Su Mo Tu We Th Fr Sa");

            // --- Step 5: Count how many spaces before day 1 ---
            int startValue = startDay.getValue(); // Monday=1 ... Sunday=7
            int spaces = startValue % 7; // Make Sunday = 0

            // --- Step 6: Print empty spaces before 1st day ---
            for (int i = 0; i < spaces; i++) {
                System.out.print("   "); // 3 spaces for each blank day
            }

            // --- Step 7: Print all days ---
            for (int day = 1; day <= totalDays; day++) {
                System.out.printf("%2d ", day); // %2d = keeps spacing even

            // After printing Saturday → next line
            if ((day + spaces) % 7 == 0) {
                System.out.println();
            }
        }

            System.out.println(); // final new line
           sc.close();
        }
    }


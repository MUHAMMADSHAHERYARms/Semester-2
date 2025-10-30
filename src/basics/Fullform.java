package basics;


import java.util.Scanner;
//public class ShortForm {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your full name: ");
//        String name = sc.nextLine(); // e.g. Muhammad Shaheryar
//        String[] words = name.split(" "); // "Muhammad" "Shaheryar"
//        String shortForm = "";
//        for (String w : words) {
//            shortForm += w.charAt(0); // har word ka pehla letter
//        System.out.println("Short form: " + shortForm.toUpperCase());
public class Fullform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Form :  ");
        String a = sc.nextLine();
        String [] wa = a.split(" ");
        String x = "";
        for (String a1 : wa){
            x += a1.charAt(0) + ".";
        }
        System.out.println(x.toUpperCase());

    }

}

package basics;
import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        color = color.toLowerCase();
        switch (color) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Get ready!");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}

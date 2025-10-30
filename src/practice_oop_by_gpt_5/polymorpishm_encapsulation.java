package practice_oop_by_gpt_5;
import java.sql.SQLOutput;
import java.util.Scanner;

//
////💻 Question:
////Create a Java program for an Islamic Banking System that demonstrates Encapsulation and Polymorphism.
////        Requirements:
////Create a base class called Account with:
////A private field balance (use encapsulation — provide getter and setter methods).
////A method calculateProfit() (instead of interest), which will be overridden by subclasses.
////Create two subclasses:
////SavingsAccount
////        BusinessAccount
////Each subclass should override the calculateProfit() method to show its own profit-sharing rule
////        (e.g., savings account → fixed profit rate, business account → profit based on percentage share).
////In the main() method:
////Create objects of both subclasses.
////Store them in a single Account reference (to show runtime polymorphism).
////Call the calculateProfit() method for both and show that output differs for each type.
////**This program shows encapsulation by keeping the balance variable private
//// and using getters/setters to access it, and it shows polymorphism because the
//// calculateProfit() method is defined once in the parent class (Account) but
//// is overridden differently in each child class (SavingsAccount and BusinessAccount),
//// so the same method name performs different actions depending on the object type.
class Account{
   private int balance;
void getbalance() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose option\n 1. Saving \n 2. Bussiness");
    int am = sc.nextInt();
    if (am == 1) {
        System.out.println();
    } else if (am==2) {
        System.out.println();

    }
}
void setBalance(){

}
void calculateprofit(){

}

}
class SavingAccount extends Account{
 @Override
    void calculateprofit(){

 }
}
class BussinessAccount extends Account{
    @Override
    void calculateprofit(){

    }
}
public class polymorpishm_encapsulation {
    public static void main(String[] args) {

     SavingAccount sa = new SavingAccount();
            BussinessAccount ba = new BussinessAccount();
    }

}






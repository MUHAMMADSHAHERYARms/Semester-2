package practice_oop_by_gpt_5;
import java.util.Scanner;
public class factorial_by_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
      int n = sc.nextInt();
       int a=1;
       if(n>=0){
         for(int i=n; i>=1; i--){
               a= a*i;
           }
           System.out.println(a);
}
       else{
           System.out.println("Enter Correct Number "); }
  }
}
//package practice_oop_by_gpt_5;
//import java.util.Scanner;
//
//public class factorial_by_method {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n : ");
//        int n = sc.nextInt();
//
//        if(n >= 0){                  // allow 0 as valid input
//            int a = 1;               // use 'a' to store factorial
//            for(int i = n; i >= 1; i--){
//                a = a * i;           // multiply 'a' instead of overwriting 'n'
//            }
//            System.out.println(a);    // print final factorial
//        }
//        else{
//            System.out.println("Enter Correct Number ");
//        }
//    }
//}

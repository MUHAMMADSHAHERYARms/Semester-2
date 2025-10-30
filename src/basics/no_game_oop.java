package basics;

/*
Create a class Game, which allows a user to play "Guess the Number"game once.
Game should have the following methods :
        1.Constructor to generate the random number
        2.takeUserInput() to take a user input of number
        3.isCorrectNumber() to detect whether the number entered by the user is true
        4.getter and setter for noOfGuesses
        use properties such as noOfGuesses(int), etc to get this task done !
 */
import java.util.Random;

class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10); // 0 se 9 tak
        System.out.println(num);
    }
}

public class no_game_oop {
    public static void main(String[] args) {

    }

}

import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args){
// Write a guessing game which prompts a user to guess a mystery number within some range.
// After every guess the program should display some variation of "too large", "too small", "correct guess".
// Upon termination, the program should display the number of guesses before successfully guessing correctly.
// A number that is input consecutively, should register as a single guess.

        

        Random rando = new Random();
        int r = rando.nextInt(100);
        r += 1;
        // r is the random number, 1-100.
        //System.out.println(r);
        boolean win = false;
        //starting win condition. changed to true if guessed correctly
        int attempt = 0;
        //starting guess attempts
        //System.out.println(r);
        //cheating

        System.out.println("Welcome to the number guessing game!");

        Scanner scan = new Scanner(System.in);
        int guess;

        int lastGuess = 0;

        while (win == false) {
            System.out.println("Guess a number between 1 and 100.");
            guess = scan.nextInt();
            if (guess == lastGuess) {
                System.out.println("You just guessed that silly! Try again.");
            } else if (guess > r) {
                attempt++;
                System.out.println("Boo! Bad guess, you went too high! Try again.");
                lastGuess = guess;
            } else if (guess < r) {
                attempt++;
                System.out.println("WRONG! Try again, but maybe try something a little higher.");
                lastGuess = guess;
            } else if (guess == r) {
                attempt++;
                System.out.println("Wow! You guessed it right! And it only took you " + attempt + " tries! Way to go.");
                win = true;
                break;
            }
        }
    }
}

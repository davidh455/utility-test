//David Hoang
import util.Input;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        int attempts = 0;
        boolean guessedCorrectly = false;
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have picked a number between 1 and 10. Try to guess it.");
        while (!guessedCorrectly) {
            int userGuess = Input.getInt("Enter your guess (1-10): ");
            attempts++;

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else if (userGuess < randomNumber) {
                System.out.println("Higher!");
            } else if (userGuess > randomNumber) {
                System.out.println("Lower!");
            } else {
                guessedCorrectly = true;
                String guessText = (attempts == 1) ? "guess" : "guesses";
                System.out.println("Congratulations! You guessed the correct number, which was " + randomNumber +
                        ", and it took " + attempts + " " + guessText + ".");
            }
        }
    }
}//end main

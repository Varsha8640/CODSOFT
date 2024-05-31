import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between " + lowerBound + " and " + upperBound + ".");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}
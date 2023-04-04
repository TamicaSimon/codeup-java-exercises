import java.util.Random;
import java.util.Scanner;

public class HighLow {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private int secretNumber;

    public void play() {
        generateSecretNumber();
        System.out.println("I'm thinking of a number between 1 and 100. What is it?");

        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = getValidatedInput(scanner);
            if (guess < secretNumber) {
                System.out.println("HIGHER");
            } else if (guess > secretNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
        } while (guess != secretNumber);
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    private int getValidatedInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int input = scanner.nextInt();
        if (input < MIN_NUMBER || input > MAX_NUMBER) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            return getValidatedInput(scanner);
        }
        return input;
    }

    public static void main(String[] args) {
        HighLow game = new HighLow();
        game.play();
    }
}

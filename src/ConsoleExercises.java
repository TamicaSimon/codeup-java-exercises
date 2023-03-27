import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %f%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Enter an integer");
//        int num = scanner.nextInt();
//        System.out.println("You entered: " + num);

//        System.out.print("Enter word 1: ");
//        String wordOne = scanner.next();
//
//        System.out.print("Enter word 2: ");
//        String wordTwo = scanner.next();
//
//        System.out.print("Enter word 3: ");
//        String wordThree = scanner.next();
//
//        System.out.println("You entered:");
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
        String sentence = scanner.nextLine();

        System.out.println("You entered: " + sentence);



    }
}
//Prompt a user to enter a integer and store that value in an int variable using the nextInt method. - Done
//
//What happens if you input something that is not an integer? - Exception in thread
//Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline. - Done
//
//What happens if you enter less than 3 words? - Waits for the 3rd word
//What happens if you enter more than 3 words? - It takes the extra words to fill the other blanks for you.
//Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. - Done
//
//do you capture all the words? - No only the first word.
//Rewrite the above example using the nextLine method. - You capture the whole sentence.
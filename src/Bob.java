import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Me: ");
            input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        } while (true);
    }
}

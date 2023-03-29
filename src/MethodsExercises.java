import java.util.Scanner;

public class MethodsExercises {
//    public static void main(String[] args) {
//            int a = 7;
//            int b = 4;
//            System.out.println(Math.addExact(a, b));
//        }

//            int a = 700;
//            int b = 200;
//
//            System.out.println(Math.subtractExact(a, b));
//        }
//        int a = 10;
//        int b = 14;
//
//        System.out.println(Math.multiplyExact(a, b));
//    }
//        int a = 14;
//        int b = 10;
//
//        System.out.println(Math.divideExact(a, b));
//    }
//        int a = 14;
//        int b = 10;
//        int c = a%b;
//        System.out.println(c);
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.printf("Enter a valid number between %d and %d: ", min, max);
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < min || input > max);

        return input;
    }

    public static void main(String[] args) {
        int userInput = getInteger(2, 20);
        System.out.printf("The number you entered is %d", userInput);
    }
}

//Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//The method signature should look like this:
//
//
//public static int getInteger(int min, int max);
//and is used like this:
//
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//

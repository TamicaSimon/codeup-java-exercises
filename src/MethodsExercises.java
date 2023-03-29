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


//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        int input;
//
//        do {
//            System.out.printf("Enter a number between %d and %d: ", min, max);
//            while (!scanner.hasNextInt()) {
//                System.out.printf("Enter a valid number between %d and %d: ", min, max);
//                scanner.next();
//            }
//            input = scanner.nextInt();
//        } while (input < min || input > max);
//
//        return input;
//    }
//
//    public static void main(String[] args) {
//        int userInput = getInteger(2, 20);
//        System.out.printf("The number you entered is %d", userInput);
//    }
//}

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.print("Enter an integer from 1 to 10 to calculate its factorial: ");
                int n = scanner.nextInt();

                if (n < 1 || n > 10) {
                    System.out.println("Number should be between 1 and 10.");
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.printf("The factorial of %d is %d\n", n, factorial);
                }

                System.out.print("Do you want to continue? (y/n): ");
            } while (scanner.next().equalsIgnoreCase("y"));

            scanner.close();
        }
    }

//    Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:

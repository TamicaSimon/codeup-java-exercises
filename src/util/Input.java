package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid number. Try again: ");
                scanner.next();
            }
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.print("Enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("That's not a valid number. Try again: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("That's not a valid number. Try again: ");
                scanner.next();
            }
            num = scanner.nextDouble();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        System.out.print("Enter a number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("That's not a valid number. Try again: ");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }
}


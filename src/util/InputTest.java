package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        System.out.print("Do you want to continue? (y/n) ");
        boolean yesNo = input.yesNo();
        System.out.println("Your response: " + yesNo);

        int numInRange = input.getInt(1, 10);
        System.out.println("You entered a number between 1 and 10: " + numInRange);

        int anyNum = input.getInt();
        System.out.println("You entered a number: " + anyNum);

        double doubleInRange = input.getDouble(1.0, 10.0);
        System.out.println("You entered a decimal number between 1.0 and 10.0: " + doubleInRange);

        double anyDouble = input.getDouble();
        System.out.println("You entered a decimal number: " + anyDouble);
    }
}


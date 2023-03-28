import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        DO WHILE LOOPS
//        int num = 100;
//        do {
//            System.out.println(num);
//            num -=5;
//        }
//        while (num >= -10);
//
//    }
//        long num = 2;
//        do {
//            System.out.println(num);
//            num=num * num;
//        }
//        while (num <= 1000000);
//        }

//        FOR LOOPS
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//        for (int num = 100; num >= -10; num-=5) {
//            System.out.println(num);
//        }

//        FIZZBUZZ
//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//
//        } while (num <=100);
//
//        for (int num = 1; num <=100; num++){
//            if (num % 3 ==0){
//                System.out.println("Fizz");
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (num % 3 ==0 && num % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(num);
//            }
//        }
//        }
//}

//        TABLE OF POWERS
        Scanner input = new Scanner(System.in);
        String choice;
        do {
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("Number\tSquare\tCube");
        for (int i=1; i <= num; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
           System.out.println("Do you want to continue (Yes/No)");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Yes"));
        }
    }


//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
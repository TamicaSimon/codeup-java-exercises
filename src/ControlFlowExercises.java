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

////        TABLE OF POWERS
//        Scanner input = new Scanner(System.in);
//        String choice;
//        do {
//        System.out.println("Enter an integer: ");
//        int num = input.nextInt();
//
//        System.out.println("Number\tSquare\tCube");
//        for (int i=1; i <= num; i++) {
//            int square = i * i;
//            int cube = i * i * i;
//            System.out.println(i + "\t" + square + "\t" + cube);
//        }
//           System.out.println("Do you want to continue (Yes/No)");
//            choice = input.next();
//        } while (choice.equalsIgnoreCase("Yes"));
//        }
//    }


//Convert given number grades into letter grades.

        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            long num = input.nextLong();

                if (num >= 88 && num <= 100) {
                    System.out.println("A");
                } else if (num >= 80 && num <= 87) {
                    System.out.println("B");
                } else if (num >= 67 && num <= 79) {
                    System.out.println("C");
                } else if (num >= 60 && num <= 66) {
                    System.out.println("D");
                } else {
                    System.out.println("F - You Failed");
                }
                System.out.println("Do you want to continue (Yes/No)");
                choice = input.next();
            }
            while (choice.equalsIgnoreCase("Yes")) ;
        }
    }



//
//Prompt the user for a numerical grade from 0 to 100.
//Display the corresponding letter grade.
//Prompt the user to continue.
//Assume that the user will enter valid integers for the grades.
//The application should only continue if the user agrees to.
//Grade Ranges:

//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0
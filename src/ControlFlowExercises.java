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

        for (int num = 1; num <=100; num++){
            if (num % 3 ==0){
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 ==0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(num);
            }
        }
        }
}


//Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

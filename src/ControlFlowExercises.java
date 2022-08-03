import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println( i );
//            i++;
//        }
//
//        int i = 0;
//        while ( i <= 100 )
//        {
//            System.out.println( i );
//            i += 2;
//        }
//
//        int i = 100;
//        while ( i >= -10 )
//        {
//            System.out.println( i );
//            i -= 5;
//        }
//
//         long i = 2;
//         do {
//             System.out.println( i );
//             i *= i;
//         } while( i < 1_000_000L );
//
//
//         int i = 100;
//         do {
//             System.out.println(i);
//             i -= 5;
//         } while(i >= -10);
//
//         for (i = 100; i >= -10; i -= 5) {
//             System.out.println(i);
//         }
//
//
//        long i;
//         for (i = 2; i < 1_000_000; i *= i) {
//             System.out.println(i);
//         }
//
//
//        for (int x = 1; x <= 100; x++) {
//            if ((x % 3 == 0) && (x % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (x % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (x % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(x);
//            }

        Scanner scanner = new Scanner(System.in);

        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go up to? ");
            int userInt = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i <= userInt; i++){
                System.out.format("%-6d", i);
                System.out.print(" | ");
                System.out.format("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();
            }
            System.out.print("Would you like to enter another number (y/n)? ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);
//
//        Scanner scanner = new Scanner(System.in);
//
//        boolean anotherGrade = true;
//
//        do {
//            System.out.print("Please enter a numerical grade from 0 to 100 ");
//
//            int numericGrade = scanner.nextInt();
//
//            if (numericGrade >= 88) {
//                System.out.println("A");
//            } else if (numericGrade >= 80) {
//                System.out.println("B");
//            } else if (numericGrade >= 67) {
//                System.out.println("C");
//            } else if (numericGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.print("Do you wish to enter a new grade? ");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//        } while (anotherGrade);
    }
}
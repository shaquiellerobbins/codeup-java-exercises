//import java.util.ArrayList;
//
//public class Movie {
//    public static final int INVALID_CHOICE = -1;
//    public static final int EXIT_CHOICE = 0;
//
//    public static void main(String[] args) {
//        Input input = new Input();
//
//        // loop until the user says he/she does not wish to continue
//        int choice = INVALID_CHOICE;
//        while(choice != EXIT_CHOICE) {
//            printMenu();
//
//            choice = input.getInt(0, 5);
//
//            doChoice(choice);
//
//        }
//    }
//
//    private static void printMenu() {
//        System.out.print("""
//                What would you like to do?
//
//                0 - exit
//                1 - view all movies
//                2 - view movies in the musical category
//                3 - view movies in the drama category
//                4 - view movies in the horror category
//                5 - view movies in the scifi category
//
//                Enter your choice: """);
//    }
//
//    private static void doChoice(int choice) {
//
//        switch(choice) {
//            case 1:
//
//                break;
//            case 2:
//
//                break;
//            case 3:
//
//                break;
//            case 4:
//
//                break;
//            case 5:
//
//                break;
//        }
//    }
//
//}
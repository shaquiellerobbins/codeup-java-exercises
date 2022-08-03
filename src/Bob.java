import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence;
        boolean theConversation;

        System.out.println("Let's talk.");

        do {
            System.out.println("What's up?");
            sentence = scanner.nextLine();

            if (sentence.endsWith("?")) {
                System.out.println("Sure.");
            } else if (sentence.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (sentence.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to keep talking with Bob? (y/n)");
            theConversation = scanner.nextLine().equalsIgnoreCase("y");
        } while (theConversation);
    }


}

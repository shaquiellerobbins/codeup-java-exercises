import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


        double pi = 3.14159;
        System.out.print("The value of pi is approximately: ");
        System.out.format("%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: ");
        System.out.printf("%s \n", userInput);

        scanner.nextLine();
        System.out.print("Enter three words: ");
        String userData = scanner.next();
        String userData2 = scanner.next();
        String userData3 = scanner.next();
        System.out.printf("Your three words are: ");
        System.out.printf("%s, %s, %s \n", userData, userData2, userData3);

        scanner.nextLine();
        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("You entered the sentence: ");
        System.out.printf("%s \n", userSentence);

        scanner.nextLine();
        int l, w, h, perimeter, area, volume;
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter width of rectangle:");
        w = s.nextInt();
        System.out.print("Enter height of rectangle:");
        h = s.nextInt();
        perimeter = 2 * (l + w);
        System.out.println("Perimeter of rectangle:" + perimeter);
        area = l * w;
        System.out.println("Area of rectangle:" + area);
        volume = l * w * h;
        System.out.println("Volume of rectangle:" + volume);

    }
}
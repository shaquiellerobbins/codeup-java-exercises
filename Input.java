public class Input {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        System.out.println("You entered: " + num);
//    }

    int[] numbers = {1, 2, 3};
    int x;

try {
        x = numbers[100];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught an array index exception!");
    } catch (Exception e) {
        System.out.println("Caught a generic exception!");
    } finally {
        System.out.println("This will always run.");
    }

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }

    public static void main(String[] args) {
        String indentationPreference;

        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }
    }

public static void main(String[] args) throws Exception {
        String indentationPreference = getIndentationPreference();
        System.out.println("Okay, " + indentationPreference + " is a great choice.");
    }

}

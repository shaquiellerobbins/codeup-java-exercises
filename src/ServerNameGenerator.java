import org.jetbrains.annotations.NotNull;

public class ServerNameGenerator {
        private static String[] adj = {"fun", "lit", "interesting", "terrifying", "groovy", "bland", "large", "wild", "sketchy", "fabulous"};
        private static String[] noun = {"fish", "monkey", "kangaroo", "koala", "giraffe", "antelope", "rat", "frog", "cat", "dog"};

        private static String randomElement(String[] strings){
            int magicNum = (int) (Math.random() * strings.length);
            return strings[magicNum];
        }

        public static @NotNull String makeServerName(String[] strings1, String[] strings2){
            String part1 = randomElement(strings1);
            String part2 = randomElement(strings2);
            String finalString = part1 + "-" + part2;
            return finalString;
        }

        public static void main(String[] args) {
            System.out.println("Your server name is:");
            System.out.println(makeServerName(adj,noun));
        }
    }




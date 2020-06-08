import java.util.Scanner;
public class TextAdventure {
    public static void main(String[] args) {
        intro();

    }

    public static String input(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        return sc.next();
    }

    public static void intro() {
        String answer = input("You just escaped from your containment cell.\n" +
                "You're not sure how, everything's hazy and you can't remember much.\n" +
                "What type of being are you?\n\n" +
                "1. Memetic\n" +
                "2. Physically Strong\n" +
                "3. Resistive");

        switch (answer) {
            case "1":
                System.out.println(
                        "You are a memetic being, you can influence others' mind and twist their thinking to your needs.\n" +
                                "Beware however, there are some who are immune to trickery of the senses.");
                break;

            case "2":
                System.out.println();
        }

    }
}

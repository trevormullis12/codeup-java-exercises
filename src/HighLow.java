import java.util.Scanner;

public class HighLow {
        public static void main(String[] args) {
            int randomNum = (int)Math.ceil(Math.random() * 100);
            numberGuess(randomNum);
        }

        public static void numberGuess(int num) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a random number between 1 and 100: ");
            int guess = sc.nextInt();

            System.out.println("Is this your answer? (y/n)");
            String input = sc.next();
            if (input.equalsIgnoreCase("y")) {
                if (guess > num) {
                    System.out.println("LOWER");
                    numberGuess(num);
                } else if (guess < num) {
                    System.out.println("HIGHER");
                    numberGuess(num);
                } else if (guess == num) {
                    System.out.println("GOOD GUESS");
                }
            } else {
                System.out.println("ok bye!");
            }
        }
    }

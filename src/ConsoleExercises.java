import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

//        //number
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//
//        //three words
//        System.out.print("Enter a single word: ");
//        String word1 = scanner.next();
//        System.out.print("Enter another word: ");
//        String word2 = scanner.next();
//        System.out.print("Enter a third word: ");
//        String word3 = scanner.next();
//        System.out.println(word1 + " " + word2 + " " + word3);
//
//        //sentence
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

        //perimeter & area
        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        int perimeter = width * 2 + length * 2;
        int area = width * length;
        System.out.println("The Perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}

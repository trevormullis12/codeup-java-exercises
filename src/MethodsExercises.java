import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        add(1, 2);
//        subtract(5, 2);
//        multiply(25, 4);
//        divide(8, 4);
//        mod(24, 2);

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        int factorial = fact(userInput);
//        System.out.println("would you like to see the factorial of this number? (y/n)");
//        String input = sc.next();
//        if(input.equalsIgnoreCase("y")) {
//            System.out.println("the factorial is: " + factorial);
//        }
//        else{
//            System.out.println("ok bye!");
//        }

        System.out.print("Enter the number of sides of the dice: ");
        int sides = sc.nextInt();
        System.out.println("would you like to roll the dice? (y/n)");
        String input = sc.next();
        if(input.equalsIgnoreCase("y")) {
            System.out.println("the roll is: " + roll(sides) + " and " + roll(sides));
        }
        else{
            System.out.println("ok bye!");
        }
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public static void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }
    public static void mod(int num1, int num2) {
        System.out.println(num1 % num2);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input <= max && input >=min) {
            return input;
        }
        else {
            System.out.println("Please return a number within the range");
            return getInteger(min, max);
        }
    }

    public static int fact(int num) {
        int newNum = 1;
        for(int i = num; i >= 1; i--) {
            newNum *= i;
        }
        return newNum;
    }

    public static int roll(int sides) {
        return (int)Math.ceil(Math.random() * sides);
    }
}

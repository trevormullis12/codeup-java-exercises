import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to go up to: ");
        int integer = scanner.nextInt();
        System.out.println("Here is your table:\n");
        System.out.println("number | squared | cubed");
        System.out.println("-------|---------|-------");

        for(int i = 1; i <= integer; i++) {
            System.out.print(i);
            System.out.print("      | ");
            System.out.print(i * i);
            System.out.print("       | ");
            System.out.println(i * i * i);
        }
    }
}

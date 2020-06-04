import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();
        System.out.println("Continue? (y/n)");
        String agree = scanner.next().toLowerCase();

        switch (agree) {
            case "y":
                if (grade >= 88)
                    System.out.print('A');
                else if (grade >= 80)
                    System.out.print('B');
                else if (grade >= 67)
                    System.out.print('C');
                else if (grade >= 60)
                    System.out.print('D');
                else
                    System.out.print('F');
                break;
            default:

                break;
        }
    }
}

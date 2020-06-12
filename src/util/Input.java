package util;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    String getString() {
        return scanner.nextLine();
    }

    boolean yesNo() {
        System.out.println("enter yes for true");
        String str = getString();
        if(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }
    int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int num = getInt();
        if(num < min || num > max)
            return getInt(min, max);
        else return num;
    }
    public double getDouble() {
        return scanner.nextDouble();
    }
    double getDouble(double min, double max) {
        System.out.println("Enter a double between " + min + " and " + max);
        double num = getDouble();
        if(num < min || num > max)
            return getDouble(min, max);
        else return num;
    }

}

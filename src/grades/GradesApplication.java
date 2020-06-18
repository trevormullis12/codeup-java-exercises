package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Jerry");
        s1.addGrade(95);
        s1.addGrade(99);
        s1.addGrade(90);
        Student s2 = new Student("Michael");
        s2.addGrade(20);
        s2.addGrade(70);
        s2.addGrade(75);
        Student s3 = new Student("Sammy");
        s3.addGrade(80);
        s3.addGrade(82);
        s3.addGrade(89);
        Student s4 = new Student("Chie");
        s4.addGrade(70);
        s4.addGrade(80);
        s4.addGrade(85);

        students.put("TomAndJerry11", s1);
        students.put("Arch4ngel", s2);
        students.put("ZammyJammer", s3);
        students.put("KungFuWarrior", s4);

        System.out.println("Welcome!\n\n" +
                "Here are the GitHub usernames of our students:\n\n" +
                "|TomAndJerry11| |Arch4ngel| |ZammyJammer| |KungFuWarrior|");
        searchUser(students);
    }

    public static void searchUser(HashMap<String, Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat student would you like to see more information on?\n");
        String searchedUser = sc.nextLine();
        if (students.containsKey(searchedUser)) {
            System.out.println(
                    "\nName: " + students.get(searchedUser).getName() +
                    "\nCurrent Average: " + students.get(searchedUser).getGradeAverage() + "\n");
        } else
            System.out.println("\nSorry, no student found with the GitHub username of \"" + searchedUser + "\".\n");

        System.out.println("Would you like to see another student?\n");
        String input = sc.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            searchUser(students);
        } else {
            System.out.println("\nGoodbye, and have a wonderful day!");
        }
    }
}

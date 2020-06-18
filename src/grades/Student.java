package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
//    grades.add(95);

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int average = 0;
        for(int i = 0; i < grades.size(); i++) {
            average += grades.get(i);
        }
        return average / grades.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jerry");
        s1.addGrade(95);
        s1.addGrade(70);
        System.out.println(s1.getGradeAverage());
    }
}

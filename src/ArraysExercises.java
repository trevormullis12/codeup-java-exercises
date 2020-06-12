import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person p1 = new Person("Jack");
        Person p2 = new Person("Jill");
        Person p3 = new Person("Rob");
        Person p4 = new Person("Michael");

        Person[] people = {p1, p2, p3};

        for (Person person : people) {
            System.out.println(person.getName());
        }

        System.out.print("\n");

        for(int i = 0; i < people.length+1; i++) {
            System.out.println(addPerson(people, p4)[i].getName());
        }


    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = new Person[people.length +1];
        for(int i = 0; i < people.length; i++) {
            newPeople[i] =  people[i];
        }
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }
}

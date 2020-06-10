public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODOne: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODOne: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODOne: print a message to the console using the person's name
        System.out.println("Hello, " + getName() + "!");
    }

    public static void main(String[] args) {
//        Person p1 = new Person("Timmy");
//        p1.sayHello();
//        p1.setName("Tommy");
//        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}

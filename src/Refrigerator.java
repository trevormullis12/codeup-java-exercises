public class Refrigerator extends Appliance {
    @Override
    public void makeSound() {
        System.out.println("*humming*");
    }

    @Override
    public void doWork() {
        System.out.println("keeping food cold...");
    }
}

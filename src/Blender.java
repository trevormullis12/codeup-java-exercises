public class Blender extends Appliance{
    @Override
    public void makeSound() {
        System.out.println("*loud whirring*");
    }

    @Override
    public void doWork() {
        System.out.println("blending up ingredients..");
    }
}

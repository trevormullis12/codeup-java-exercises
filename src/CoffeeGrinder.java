public class CoffeeGrinder extends Appliance{
    @Override
    public void makeSound() {
        System.out.println("*chopping*");
    }

    @Override
    public void doWork() {
        System.out.println("blending perfect cup of coffee...");
    }
}

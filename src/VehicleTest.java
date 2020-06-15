public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(false, 2, "gas");
        Vehicle car = new Car();
        Vehicle jet = new Jet();

        car.setOperable(true);
        car.setCapacity(5);
        car.setPower("gas");

        jet.setOperable(true);
        jet.setCapacity(1);
        jet.setPower("jet fuel");

        System.out.printf(car.toString());
        System.out.printf(jet.toString());
        System.out.println(vehicle.toString());
    }
}

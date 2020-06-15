public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(false, 2, "gas");
        Car car = new Car(true, 5, "gas", 32);
        Jet jet = new Jet(true, 1, "jet_fuel", 500);

//        car.setOperable(true);
//        car.setCapacity(5);
//        car.setPower("gas");

//        jet.setOperable(true);
//        jet.setCapacity(1);
//        jet.setPower("jet fuel");

        System.out.printf(car.toString());
        car.deployAirBag();
        System.out.printf(jet.toString());
        jet.takeOff();
        System.out.println(vehicle.toString());

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = vehicle;
        vehicles[1] = car;
        vehicles[2] = jet;

        for(Vehicle a: vehicles) {
            a.turnOn();
        }
    }
}

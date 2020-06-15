public class Car extends Vehicle {
    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }
    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon() {
        return this.milesPerGallon;
    }

    public void deployAirBag() {
        System.out.println("Airbag deployed!");
    }

    public void turnOn() {
        System.out.println("Cranking engine..");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Operable=" + this.getOperable() +
                ", passengerCapacity=" + this.getCapacity() +
                ", powerSource=" + this.getPower() +
                ", milesPerGallon=" + this.getMilesPerGallon() + "}\n";
    }
}

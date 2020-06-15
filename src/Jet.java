public class Jet extends Vehicle {
    private int maximumAltitude;

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }
    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return this.maximumAltitude;
    }

    public void takeOff() {
        System.out.println("Taking off...");
    }

    public void turnOn() {
        System.out.println("Igniting jet engines...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Operable=" + this.getOperable() +
                ", passengerCapacity=" + this.getCapacity() +
                ", powerSource=" + this.getPower() +
                ", maximumAltitude=" + this.getMaximumAltitude() + "}\n";
    }
}

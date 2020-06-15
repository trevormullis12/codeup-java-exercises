public class Vehicle {
    private boolean isOperable; //(intended to describe if the vehicle is functional or broken)
    private int passengerCapacity; //(intended to describe how many people it can transport)
    private String powerSource; //(intended to describe how the vehicle is powered, e.g. "gas", "electric", "nuclear", "human-effort", etc.)

    public boolean getOperable() {
        return this.isOperable;
    }
    public void setOperable(boolean isOperable) {
        this.isOperable = isOperable;
    }
    public int getCapacity() {
        return this.passengerCapacity;
    }
    public void setCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public String getPower() {
        return this.powerSource;
    }
    public void setPower(String powerSource) {
        this.powerSource = powerSource;
    }

    public Vehicle(){}

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource) {
        setOperable(isOperable);
        setCapacity(passengerCapacity);
        setPower(powerSource);
    }

    public String toString() {
        return this.isOperable + "\n" + this.passengerCapacity + "\n" + this.powerSource + "\n";
    }

}

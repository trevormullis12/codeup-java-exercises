abstract class Appliance {
    private String brand;
    private String color;

    public Appliance() {}

    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void makeSound();
    public abstract void doWork();

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}

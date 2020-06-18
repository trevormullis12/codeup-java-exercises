package shapes;

public class Rectangle extends Quadrilateral implements Mesurable {
    public Rectangle(double length, double width){
        super(length, width);
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter:");
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        System.out.println("Area:");
        return this.length * this.width;
    }

//    protected double length;
//    protected double width;
//
//    public Rectangle() {
//
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//


}

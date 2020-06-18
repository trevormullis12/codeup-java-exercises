package shapes;

public class Square extends Rectangle implements Mesurable{

    public Square(double s) {
        super(s,s);
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

//    public Square(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        System.out.println("Area of the rectangle:");
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        System.out.println("Perimeter of the rectangle:");
//        return (this.length * 2) + (this.width * 2);
//    }
}

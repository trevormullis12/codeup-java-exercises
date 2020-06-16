package shapes;

public class Square extends Rectangle{
    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public double getArea() {
        System.out.println("Area of the square:");
        return this.width * this.width;
    }

    public double getPerimeter() {
        System.out.println("Perimeter of the square:");
        return this.width * 4;
    }
}

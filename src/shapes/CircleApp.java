package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter your circle radius");
        Input in = new Input();
        double radius = in.getDouble();
        Circle circ = new Circle(radius);
        System.out.println(circ.getArea());
        System.out.println(circ.getCircumference());
    }
}

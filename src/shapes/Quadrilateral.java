package shapes;

abstract class Quadrilateral extends Shape implements Mesurable{
    protected double length;
    protected double width;

    public Quadrilateral(){}

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}

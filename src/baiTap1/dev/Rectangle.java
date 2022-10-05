package baiTap1.dev;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width*this.length;
    }

    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    public String toString(){
//        return "a rectangle with width = " + getWidth() + " and length = " + getLength() + ", which is a subclass of " + super.toString();
        return ""+getArea();
    }

    @Override
    public void resize(double percent) {
        this.length = this.length*percent;
        this.width = this.width*percent;
    }
}

package baiTap1.dev;

import baiTap1.dev.Rectangle;
import baiTap2.dev.Colorable;

public class Square extends Rectangle implements Resizeable, Colorable {
    private double side;
    public Square() {
        this.setWidth(1.0);
        this.setLength(1.0);
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getWidth() {
        return super.getWidth();
    }

    public void setWidth(double width) {
        this.side = width;
        super.setWidth(width);
        super.setLength(width);
    }

    public String toString() {
//        return "A square with side = " + getSide() + ", which is a subclass of "+super.toString();
        return ""+getArea();
    }

    public void resize(double percent) {
        this.side= this.side*percent;
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

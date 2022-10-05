package baiTap1.run;

import baiTap1.dev.Circle;
import baiTap1.dev.Rectangle;
import baiTap1.dev.Shape;
import baiTap1.dev.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[3];
        Circle circle = new Circle("red",true,5.8);
        double oldCircleArea = circle.getArea();
        circle.resize(Math.random()*100);
        double updatedCircleArea = circle.getArea();
        arrShape[0] = circle;

        Rectangle rectangle = new Rectangle("blue",false,3.6,10.02);
        double oldRectangleArea = rectangle.getArea();
        rectangle.resize(Math.random()*100);
        double updatedRectangleArea = rectangle.getArea();
        arrShape[1] = rectangle;

        Square square = new Square(4);
        double oldSquareArea = square.getArea();
        square.resize(Math.random()*100);
        double updatedSquareArea = square.getArea();
        arrShape[2] = square;

        System.out.printf("%-25s%-25s%-25s\n","Shape","Old Area","Updated Area");
        System.out.printf("%-25s%-25f%-25f\n","Circle",oldCircleArea,updatedCircleArea);
        System.out.printf("%-25s%-25f%-25f\n","Rectangle",oldRectangleArea,updatedRectangleArea);
        System.out.printf("%-25s%-25f%-25f\n","Square",oldSquareArea,updatedSquareArea);
    }

}

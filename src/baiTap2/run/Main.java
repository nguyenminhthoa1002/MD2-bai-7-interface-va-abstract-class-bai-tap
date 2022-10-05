package baiTap2.run;

import baiTap1.dev.Circle;
import baiTap1.dev.Rectangle;
import baiTap1.dev.Shape;
import baiTap1.dev.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(2,10);
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("Area of shape %d is: %s\n",i+1,shapes[i].toString());
            if (shapes[i] instanceof Square) {
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}

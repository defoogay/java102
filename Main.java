import java.util.ArrayList;

import Classes.Circle;
import Classes.Grid;
import Classes.Point;
import Classes.RightTriangle;
import Classes.Shape;
import Classes.Square;
import Inheritence.LibraryItem;

public class Main {
    public static void main(String[] args) {
        Point yes = new Point(15,15);
        Point maybe = new Point(10, 10);
        Square no = new Square(maybe, 10);
        System.out.println(no.isOn(yes));
        Point[] Corners = no.corners();
        for (int i = 0; i < 4; i++){
            System.out.println(Corners[i]);
        }
        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)};
            System.out.println(sumArea(shapes));
        RightTriangle triFour = new RightTriangle(maybe, 10.0, 10.0);
        System.out.println(triFour.isOn(yes));
    }
    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> allAvailable = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.available()) {
                allAvailable.add(item);
            }
        }
        return allAvailable;
    }
}

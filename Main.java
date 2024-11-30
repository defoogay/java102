import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        Point coin = new Point(8, 6);
        Point poop = new Point(12, 9);
        System.out.println("x: " + point.x + " " + "y: " + point.y);
        Point xTranslation = point.translateX(3); 
        Point yTranslation = point.translateY(-7); 
        Point xyTranslation = point.translateX(-4).translateY(-3);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        Test test = new Test(1, 2);
        System.out.println("I printed " + test.yes + " and " + test.no);
        System.out.println(Point.distance(point, coin));
        Point[] arrA = {point, coin, poop};
        Point centerOfMass = Point.centerOfMass(arrA);
        System.out.println(centerOfMass);
        System.out.println(point.angle());
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);
        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
	        intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));
        Grid<Integer> grids = new Grid<>(7, 0);
        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);
        System.out.println(grids);
        System.out.println(grid.diagonal());
        System.out.println(Grid.maxSideLength());
        Point yes = new Point(14,131);
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
        System.out.println(triFour.isInside(yes));
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
}

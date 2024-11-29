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
        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);
        System.out.println(grid.diagonal());
    }
}

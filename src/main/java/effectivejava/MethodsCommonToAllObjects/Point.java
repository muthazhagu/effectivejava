package effectivejava.MethodsCommonToAllObjects;

/**
 * Created by muthu on 12/24/16.
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point otherPoint = (Point) o;
            return (x == otherPoint.x && y == otherPoint.y);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(1, 2);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}

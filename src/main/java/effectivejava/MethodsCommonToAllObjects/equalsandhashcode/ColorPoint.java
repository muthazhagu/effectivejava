package effectivejava.MethodsCommonToAllObjects.equalsandhashcode;

/**
 * Created by muthu on 12/24/16.
 */
public class ColorPoint {
    private final Point p;
    private String color;

    public ColorPoint(int x, int y, String color) {
        p = new Point(x, y);
        this.color = color;
    }

    public Point getPoint() {
        return p;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ColorPoint) {
            ColorPoint otherColorPoint = (ColorPoint) o;
            return p.equals(otherColorPoint.p) && color.equals(otherColorPoint.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + p.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    public static void main(String[] args) {
        ColorPoint c1 = new ColorPoint(1, 2, "RED");
        ColorPoint c2 = new ColorPoint(1, 2, "YELLOW");
        ColorPoint c3 = new ColorPoint(1, 2, "RED");

        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c1));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

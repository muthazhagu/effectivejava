package effectivejava.MethodsCommonToAllObjects.comparable;

/**
 * Created by muthu on 12/25/16.
 */
public class ClientPhoneNumber {
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber(617, 378, 5819);
        PhoneNumber p2 = new PhoneNumber(617, 378, 5819);
        PhoneNumber p3 = new PhoneNumber(617, 378, 5820);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(p3));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(p1.compareTo(p1));
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));
        System.out.println(p1.compareTo(p3));
        System.out.println(p3.compareTo(p1));
    }
}

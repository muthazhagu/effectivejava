package effectivejava.MethodsCommonToAllObjects;

/**
 * Created by muthu on 12/24/16.
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }

        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
    }

    @Override
    public int hashCode() {
        return 31 * s.hashCode();
    }

    public static void main(String[] args) {
        CaseInsensitiveString c1 = new CaseInsensitiveString("String 1");
        CaseInsensitiveString c2 = new CaseInsensitiveString("String 2");
        CaseInsensitiveString c3 = new CaseInsensitiveString("String 1");
        CaseInsensitiveString c4 = c1;

        // == checks for identity - do the references point to the same object?
        // equals checks for values - do the objects have the same properties?

        System.out.println(c1.equals(c1));
        System.out.println(c1 == c1);
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c3));
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c4));
        System.out.println(c1 == c4);
    }
}

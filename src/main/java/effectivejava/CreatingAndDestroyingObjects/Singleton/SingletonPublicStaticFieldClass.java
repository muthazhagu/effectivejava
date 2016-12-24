package effectivejava.CreatingAndDestroyingObjects.Singleton;

/**
 * Created by muthu on 12/23/16.
 */
public class SingletonPublicStaticFieldClass {
    public static final SingletonPublicStaticFieldClass INSTANCE = new SingletonPublicStaticFieldClass();

    private SingletonPublicStaticFieldClass() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

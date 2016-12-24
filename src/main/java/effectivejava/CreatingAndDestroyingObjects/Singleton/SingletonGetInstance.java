package effectivejava.CreatingAndDestroyingObjects.Singleton;

/**
 * Created by muthu on 12/23/16.
 */
public class SingletonGetInstance {
    private static final SingletonGetInstance INSTANCE = new SingletonGetInstance();

    private SingletonGetInstance(){}

    public static SingletonGetInstance getInstance(){
        return INSTANCE;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}

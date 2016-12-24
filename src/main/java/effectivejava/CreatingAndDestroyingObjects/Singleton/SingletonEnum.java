package effectivejava.CreatingAndDestroyingObjects.Singleton;

/**
 * Created by muthu on 12/23/16.
 */
public enum SingletonEnum {
    INSTANCE;

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}

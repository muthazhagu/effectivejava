package effectivejava.CreatingAndDestroyingObjects.StaticFactoryMethodForConstructor;

/**
 * Item 1: Consider static factory methods instead of constructors.
 */
public class MyFirstClass implements MyInterface {
    public static MyInterface getInstance() {
        return new MyFirstClass();
    }

    public static MyInterface getOtherInstance() {
        return new MySecondClass();
    }

    public static MyInterface getSpecificInstance(String whichInstance) {
        return whichInstance.equals("second") ? new MySecondClass() : new MyFirstClass();
    }

    @Override
    public String getMyName() {
        return "Instance of " + getClass().getSimpleName();
    }
}

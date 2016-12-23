package effectivejava.CreatingAndDestroyingObjects.StaticFactoryMethodForConstructor;

/**
 * Item 1: Consider static factory methods instead of constructors.
 */
public class MyClass implements MyInterface{
    public static MyInterface getInstance(){
        return new MyClass();
    }

    public static MyInterface getOtherInstance(){
        return new MySecondClass();
    }

    public static MyInterface getSpecificInstance(String whichInstance){
        return whichInstance.equals("second") ? new MySecondClass() : new MyClass();
    }

    @Override
    public String toString(){
        return "Instance of " + getClass().getSimpleName();
    }
}

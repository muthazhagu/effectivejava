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

    @Override
    public String toString(){
        return "Instance of " + getClass().getSimpleName();
    }

    public static void main(String[] args){
        System.out.println(MyClass.getInstance().toString());
        System.out.println(MyClass.getOtherInstance().toString());
    }
}

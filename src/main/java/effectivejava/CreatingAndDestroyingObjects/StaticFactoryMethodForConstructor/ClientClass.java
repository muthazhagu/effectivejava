package effectivejava.CreatingAndDestroyingObjects.StaticFactoryMethodForConstructor;

/**
 * Created by muthu on 12/22/16.
 */
public class ClientClass {
    public static void main(String[] args){
        System.out.println(MyClass.getInstance().toString());
        System.out.println(MyClass.getOtherInstance().toString());

        System.out.println("\nGetting specific instances based on parameters being passed in.");
        System.out.println(MyClass.getSpecificInstance("first").toString());
        System.out.println(MyClass.getSpecificInstance("second").toString());
    }
}

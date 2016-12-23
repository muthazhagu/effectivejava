package effectivejava.CreatingAndDestroyingObjects.StaticFactoryMethodForConstructor;

/**
 * Created by muthu on 12/22/16.
 */
public class ClientClass {
    public static void main(String[] args) {
        System.out.println(MyFirstClass.getInstance().getMyName());
        System.out.println(MyFirstClass.getOtherInstance().getMyName());

        System.out.println("\nGetting specific instances based on parameters being passed in.");
        System.out.println(MyFirstClass.getSpecificInstance("first").getMyName());
        System.out.println(MyFirstClass.getSpecificInstance("second").getMyName());

        System.out.println("\nGetting classes from another class.");
        System.out.println(MyClasses.getSpecificInstance("A").getMyName());
        System.out.println(MyClasses.getSpecificInstance("Y").getMyName());
    }
}

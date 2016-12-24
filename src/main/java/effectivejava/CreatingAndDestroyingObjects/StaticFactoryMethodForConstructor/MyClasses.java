package effectivejava.CreatingAndDestroyingObjects.StaticFactoryMethodForConstructor;

/**
 * Created by muthu on 12/22/16.
 */
public class MyClasses {
    private MyClasses() {
    }

    static MyInterface getMyXClass() {
        return new MyXClass();
    }

    static MyInterface getMyYClass() {
        return new MyYClass();
    }

    static MyInterface getSpecificInstance(String whichInstance) {
        return whichInstance.equals("Y") ? getMyYClass() : getMyXClass();
    }

    private static class MyXClass implements MyInterface {
        @Override
        public String getMyName() {
            return "Instance of " + getClass().getSimpleName();
        }
    }

    private static class MyYClass implements MyInterface {
        @Override
        public String getMyName() {
            return "Instance of " + getClass().getSimpleName();
        }
    }
}

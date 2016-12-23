package effectivejava.CreatingAndDestroyingObjects.StaticFactoryMethodForConstructor;

/**
 * Created by muthu on 12/22/16.
 */
class MySecondClass implements MyInterface {
    @Override
    public String getMyName() {
        return "Instance of " + getClass().getSimpleName();
    }
}

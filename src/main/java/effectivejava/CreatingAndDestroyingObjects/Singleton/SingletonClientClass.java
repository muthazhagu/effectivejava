package effectivejava.CreatingAndDestroyingObjects.Singleton;

/**
 * Created by muthu on 12/23/16.
 */
public class SingletonClientClass {
    public static void main(String[] args){
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonGetInstance singletonGetInstance = SingletonGetInstance.getInstance();
        SingletonPublicStaticFieldClass singletonPublicStaticFieldClass = SingletonPublicStaticFieldClass.INSTANCE;

        System.out.println(singletonEnum.toString());
        System.out.println(singletonGetInstance.toString());
        System.out.println(singletonPublicStaticFieldClass.toString());
    }
}

package effectivejava.CreatingAndDestroyingObjects.Builder;

/**
 * Created by muthu on 12/23/16.
 */
public class BuilderClientClass {
    public static void main(String[] args) {
        LotsOfParamsClass lotsOfParamsClass = new LotsOfParamsClass.Builder(1, 2).build();
        System.out.println("No optional values");
        System.out.println(lotsOfParamsClass.toString());

        LotsOfParamsClass lotsOfParamsClass1 = new LotsOfParamsClass.Builder(3, 4)
                .optionalProperty1(5)
                .optionalProperty2(6)
                .build();
        System.out.println("\nAll values filled in");
        System.out.println(lotsOfParamsClass1.toString());
    }
}

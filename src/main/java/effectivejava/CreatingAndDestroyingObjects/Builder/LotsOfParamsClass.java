package effectivejava.CreatingAndDestroyingObjects.Builder;

/**
 * Created by muthu on 12/23/16.
 */
public class LotsOfParamsClass {
    private final int requiredProperty1;
    private final int requiredProperty2;
    private final int optionalProperty1;
    private final int optionalProperty2;

    public static class Builder {
        private final int requiredProperty1;
        private final int requiredProperty2;

        private int optionalProperty1;
        private int optionalProperty2;

        public Builder(int p1, int p2) {
            this.requiredProperty1 = p1;
            this.requiredProperty2 = p2;
        }

        public Builder optionalProperty1(int val) {
            this.optionalProperty1 = val;
            return this;
        }

        public Builder optionalProperty2(int val) {
            this.optionalProperty2 = val;
            return this;
        }

        public LotsOfParamsClass build() {
            return new LotsOfParamsClass(this);
        }
    }

    private LotsOfParamsClass(Builder builder) {
        requiredProperty1 = builder.requiredProperty1;
        requiredProperty2 = builder.requiredProperty2;
        optionalProperty1 = builder.optionalProperty1;
        optionalProperty2 = builder.optionalProperty2;
    }

    @Override
    public String toString() {
        return String.join("\n", "LotsOfParamsClass with the following values",
                Integer.toString(requiredProperty1),
                Integer.toString(requiredProperty2),
                Integer.toString(optionalProperty1),
                Integer.toString(optionalProperty2));
    }
}

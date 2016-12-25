package effectivejava.MethodsCommonToAllObjects.comparable;

/**
 * Created by muthu on 12/25/16.
 */
class PhoneNumber implements Comparable<PhoneNumber> {
    private final int areaCode;
    private final int prefix;
    private final int number;

    PhoneNumber(int areaCode, int prefix, int number) {
        if (rangeCheck(areaCode, 0, 999)) {
            this.areaCode = areaCode;
        } else {
            throw new IllegalArgumentException(String.valueOf(areaCode));
        }

        if (rangeCheck(prefix, 0, 999)) {
            this.prefix = prefix;
        } else {
            throw new IllegalArgumentException(String.valueOf(prefix));
        }

        if (rangeCheck(number, 0, 9999)) {
            this.number = number;
        } else {
            throw new IllegalArgumentException(String.valueOf(number));
        }
    }

    private boolean rangeCheck(int value, int min, int max) {
        return value >= min && value <= max;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PhoneNumber) {
            PhoneNumber otherPhoneNumber = (PhoneNumber) o;
            return otherPhoneNumber.areaCode == areaCode
                    && otherPhoneNumber.prefix == prefix
                    && otherPhoneNumber.number == number;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, number);
    }

    @Override
    public int compareTo(PhoneNumber otherPhoneNumber) {
        if (areaCode < otherPhoneNumber.areaCode) {
            return -1;
        }

        if (areaCode > otherPhoneNumber.areaCode) {
            return 1;
        }

        if (prefix < otherPhoneNumber.prefix) {
            return -1;
        }

        if (prefix > otherPhoneNumber.prefix) {
            return 1;
        }

        if (number < otherPhoneNumber.number) {
            return -1;
        }

        if (number > otherPhoneNumber.number) {
            return 1;
        }

        return 0;
    }
}

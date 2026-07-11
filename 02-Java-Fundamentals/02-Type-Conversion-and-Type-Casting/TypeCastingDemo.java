public class TypeCastingDemo {

    public static void main(String[] args) {

        System.out.println("===== Explicit Type Casting (Narrowing) =====\n");

        double doubleValue = 25.75;

        int intValue = (int) doubleValue;

        short shortValue = (short) intValue;

        byte byteValue = (byte) shortValue;

        System.out.println("Original double value : " + doubleValue);
        System.out.println("Converted int value   : " + intValue);
        System.out.println("Converted short value : " + shortValue);
        System.out.println("Converted byte value  : " + byteValue);

        System.out.println();

        System.out.println("Observation:");
        System.out.println("Explicit casting is done manually by the programmer.");
        System.out.println("It converts a larger data type into a smaller data type.");
        System.out.println("Decimal values may be lost during conversion.");

    }
}
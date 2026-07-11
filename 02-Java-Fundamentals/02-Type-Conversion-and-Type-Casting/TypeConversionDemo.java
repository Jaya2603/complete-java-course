public class TypeConversionDemo {

    public static void main(String[] args) {

        System.out.println("===== Implicit Type Conversion (Widening) =====\n");

        byte byteValue = 10;
        short shortValue = byteValue;

        int intValue = shortValue;

        long longValue = intValue;

        float floatValue = longValue;

        double doubleValue = floatValue;

        System.out.println("byte   : " + byteValue);
        System.out.println("short  : " + shortValue);
        System.out.println("int    : " + intValue);
        System.out.println("long   : " + longValue);
        System.out.println("float  : " + floatValue);
        System.out.println("double : " + doubleValue);

        System.out.println();

        System.out.println("Observation:");
        System.out.println("Java automatically converts");
        System.out.println("smaller data types into larger data types.");
        System.out.println("This process is called Implicit Type Conversion or Widening.");

    }
}
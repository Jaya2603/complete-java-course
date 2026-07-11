public class BytePromotionDemo {

    public static void main(String[] args) {

        System.out.println("===== Promotion of byte, short and char =====\n");

        byte a = 10;
        byte b = 20;

        // byte c = a + b; // Compilation Error

        int c = a + b;

        System.out.println("byte a = " + a);
        System.out.println("byte b = " + b);
        System.out.println("int c = a + b = " + c);

        System.out.println();

        short s1 = 100;
        short s2 = 200;

        int s3 = s1 + s2;

        System.out.println("short s1 = " + s1);
        System.out.println("short s2 = " + s2);
        System.out.println("int s3 = s1 + s2 = " + s3);

        System.out.println();

        char ch1 = 'A';
        char ch2 = 1;

        int ch3 = ch1 + ch2;

        System.out.println("char ch1 = " + ch1);
        System.out.println("char ch2 = " + (int) ch2);
        System.out.println("int ch3 = ch1 + ch2 = " + ch3);

        System.out.println();

        System.out.println("Observation:");
        System.out.println("- byte, short and char are automatically promoted to int.");
        System.out.println("- Arithmetic operations on these data types always produce an int.");

    }
}
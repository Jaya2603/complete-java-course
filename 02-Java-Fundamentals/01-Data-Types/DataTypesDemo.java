public class DataTypesDemo {

    public static void main(String[] args) {

        // Primitive Data Types

        byte b = 10;
        short s = 100;
        int i = 500;
        long l = 100000L;

        float f = 3.14f;
        double d = 99.99;

        char c = 'A';
        boolean flag = true;

        // Non-Primitive Data Type

        String name = "John";

        System.out.println("========== Primitive Data Types ==========\n");

        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : " + c);
        System.out.println("boolean : " + flag);

        System.out.println();

        System.out.println("======= Non-Primitive Data Type =======\n");

        System.out.println("String  : " + name);

        System.out.println();

        System.out.println("========================================");
        System.out.println("Primitive Data Types:");
        System.out.println("- Store actual values");
        System.out.println("- Fixed memory size");
        System.out.println("- Faster access");

        System.out.println();

        System.out.println("Non-Primitive Data Types:");
        System.out.println("- Store references (addresses)");
        System.out.println("- Size can vary");
        System.out.println("- Can have methods");

    }
}
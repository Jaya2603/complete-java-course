public class TypePromotionDemo {

    public static void main(String[] args) {

        System.out.println("===== Type Promotion in Mixed Expressions =====\n");

        int a = 5;
        long b = 10;
        float c = 2.5f;
        double d = 4.75;

        long result1 = a + b;
        System.out.println("int + long = " + result1);

        float result2 = a + b + c;
        System.out.println("int + long + float = " + result2);

        double result3 = a + b + c + d;
        System.out.println("int + long + float + double = " + result3);

        System.out.println();

        System.out.println("Observation:");
        System.out.println("- Java promotes smaller data types to larger data types.");
        System.out.println("- The final result is of the largest data type in the expression.");

    }
}
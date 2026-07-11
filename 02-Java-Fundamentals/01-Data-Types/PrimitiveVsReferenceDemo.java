public class PrimitiveVsReferenceDemo {

    public static void main(String[] args) {

        System.out.println("========== Primitive Data Type ==========\n");

        int a = 10;
        int b = a;

        System.out.println("Before changing value:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;

        System.out.println("\nAfter changing b:");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\nObservation:");
        System.out.println("Changing 'b' does NOT affect 'a'.");
        System.out.println("Primitive variables store actual values.");

        System.out.println("\n=========================================\n");

        System.out.println("======= Non-Primitive Data Type =======\n");

        StringBuilder name1 = new StringBuilder("John");
        StringBuilder name2 = name1;

        System.out.println("Before modification:");
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        name2.append(" Doe");

        System.out.println("\nAfter modifying name2:");

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("\nObservation:");
        System.out.println("Changing name2 also changes name1.");
        System.out.println("Both variables refer to the same object.");
        System.out.println("Non-primitive variables store references.");

    }
}
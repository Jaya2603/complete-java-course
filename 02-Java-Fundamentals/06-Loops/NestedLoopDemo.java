public class NestedLoopDemo {
    public static void main(String[] args) {
        System.out.println("===== Nested Loop Example =====\n");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println();
        System.out.println("===== Star Pattern =====\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("===== Multiplication Table (2) =====\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
}
public class NestedIfDemo {

    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        System.out.println("===== Nested if =====\n");

        if (age >= 18) {

            if (hasID) {
                System.out.println("Allowed Entry");
            } else {
                System.out.println("ID Required");
            }

        } else {
            System.out.println("Under Age");
        }

        System.out.println("Program Ended.");
    }
}
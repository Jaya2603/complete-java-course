public class ArrayIndexing {

    public static void main(String[] args) {

        String[] students = { "Alice", "Bob", "Charlie", "David", "Eva" };

        // Accessing Elements Using Index
        System.out.println("First Student : " + students[0]);
        System.out.println("Third Student : " + students[2]);

        // Displaying Array Information
        System.out.println("\nArray Length : " + students.length);
        System.out.println("Last Index : " + (students.length - 1));
        System.out.println("Last Student : " + students[students.length - 1]);

        // Displaying Index and Value
        System.out.println("\nStudent List:");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Index " + i + " -> " + students[i]);
        }
    }
}
public class ArrayIntroduction {

    public static void main(String[] args) {

        // Declaration and Initialization
        int[] arr = { 10, 20, 30, 40, 50 };

        // Accessing Elements
        System.out.println("First Element: " + arr[0]);
        System.out.println("Third Element: " + arr[2]);

        // Traversing the Array
        System.out.println("\nArray Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
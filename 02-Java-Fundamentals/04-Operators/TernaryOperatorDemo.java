public class TernaryOperatorDemo {

    public static void main(String[] args) {

        System.out.println("===== Ternary Operator =====\n");

        // Example 1: Find Maximum
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("Maximum Number : " + max);

        System.out.println();

        // Example 2: Even or Odd
        int number = 5;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);

        System.out.println();

        // Example 3: Positive, Negative or Zero
        int num = 0;

        String value = (num > 0)
                ? "Positive"
                : (num < 0)
                        ? "Negative"
                        : "Zero";

        System.out.println("Number is " + value);

    }
}
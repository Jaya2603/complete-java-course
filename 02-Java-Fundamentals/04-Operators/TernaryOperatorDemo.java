public class TernaryOperatorDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("===== Ternary Operator =====\n");
        int max = (a > b) ? a : b;
        System.out.println("Maximum value : " + max);
        int age = 18;
        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println(result);
    }
}
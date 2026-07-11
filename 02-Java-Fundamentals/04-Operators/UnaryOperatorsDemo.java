public class UnaryOperatorsDemo {

    public static void main(String[] args) {

        int x = 5;
        System.out.println("===== Unary Operators =====\n");
        System.out.println("Initial value : " + x);
        System.out.println("++x : " + (++x));
        System.out.println("x++ : " + (x++));
        System.out.println("After x++ : " + x);
        System.out.println("--x : " + (--x));
        System.out.println("x-- : " + (x--));
        System.out.println("After x-- : " + x);
        System.out.println("Unary + : " + (+x));
        System.out.println("Unary - : " + (-x));
        boolean flag = true;
        System.out.println("!flag : " + (!flag));
    }
}
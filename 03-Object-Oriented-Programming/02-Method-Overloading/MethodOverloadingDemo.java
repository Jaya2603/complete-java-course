class MathUtil {

    // Different number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Different data types
    double add(double a, double b) {
        return a + b;
    }

    // Different order of parameters
    void show(int id, String name) {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    void show(String name, int id) {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        MathUtil math = new MathUtil();

        System.out.println("===== Different Number of Parameters =====");
        System.out.println("add(10, 20) = " + math.add(10, 20));
        System.out.println("add(10, 20, 30) = " + math.add(10, 20, 30));

        System.out.println();

        System.out.println("===== Different Data Types =====");
        System.out.println("add(10.5, 20.5) = " + math.add(10.5, 20.5));

        System.out.println();

        System.out.println("===== Different Order of Parameters =====");
        math.show(101, "John");

        System.out.println();

        math.show("Alice", 102);
    }
}
class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 101;
        student1.name = "John";

        Student student2 = new Student();
        student2.id = 102;
        student2.name = "Alice";

        System.out.println("===== Student 1 =====");
        student1.display();

        System.out.println();

        System.out.println("===== Student 2 =====");
        student2.display();
    }
}
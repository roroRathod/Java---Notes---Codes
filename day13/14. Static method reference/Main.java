@FunctionalInterface
interface Intr {
    void sayHello(String name);
}

public class Main {
    public static void fun1(String s) {
        System.out.println("Using static Method reference Welcome " + s);
    }

    public static void main(String[] args) {
        Intr i1 = Main::fun1;
        i1.sayHello("Admin");
    }
}

@FunctionalInterface
interface Intr {
    void sayHello();
}

public class Main {
    Main() {
        System.out.println("Method reference using Constructor");
    }

    public static void main(String[] args) {
        Intr i1 = Main::new;
        i1.sayHello();
    }
}

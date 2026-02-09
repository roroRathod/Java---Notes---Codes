@FunctionalInterface
interface Intr {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Intr i1 = () -> {
            System.out.println("Welcome User");
        };
        i1.sayHello();
    }
}

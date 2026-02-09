@FunctionalInterface
interface Intr {
    void sayHello(String name);
}

public class Main {
    public static void main(String[] args) {
        Intr i1 = (String name) -> {
            System.out.println("Welcome " + name);
        };
        i1.sayHello("User");
    }
}


//Simplified syntax
// Intr i1 = (name) -> {
//     System.out.println("Welcome " + name);
// };

// Intr i2 = n -> {
//     System.out.println("Welcome " + n);
// };

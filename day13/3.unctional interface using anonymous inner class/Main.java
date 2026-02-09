@FunctionalInterface
interface Intr {
    void sayHello(String name);
}

class Main {
    public static void main(String[] args) {
        Intr i1 = new Intr() {
            @Override
            public void sayHello(String name) {
                System.out.println("Welcome " + name);
            }
        };
        i1.sayHello("Amit");
    }
}

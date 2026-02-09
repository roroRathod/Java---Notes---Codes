@FunctionalInterface
interface Intr {
    void sayHello(String name);

    boolean equals(Object obj);

    default void fun1() {
        System.out.println("inside the default method fun1 of Intr");
    }

    static void fun2() {
        System.out.println("inside the static method fun2 of Intr");
    }
}

class X implements Intr {
    @Override
    public void sayHello(String name) {
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {
        Intr i1 = new X();
        i1.sayHello("Admin");
        i1.fun1();
        System.out.println(i1.equals(i1));
        Intr.fun2();
    }
}

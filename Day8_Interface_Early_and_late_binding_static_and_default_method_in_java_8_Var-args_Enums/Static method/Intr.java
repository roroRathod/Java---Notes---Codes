interface Intr {
    void method1();

    default void method2() {
        System.out.println("inside method2");
    }

    static void method3() {
        System.out.println("inside method3");
    }
}

@FunctionalInterface
interface Intr {
    void printNumber(int number);
}

public class Main {
    public void fun1(int num) {
        System.out.println("Using non-static Method reference Welcome " + num);
    }

    public static void main(String[] args) {
        Intr i1 = new Main()::fun1;
        i1.printNumber(12);

        Intr i2 = System.out::print;
        i2.printNumber(15);
    }
}

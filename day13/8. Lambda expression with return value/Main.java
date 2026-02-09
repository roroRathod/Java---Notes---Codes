@FunctionalInterface
interface Intr {
    int add(int num1, int num2);
}

public class Main {
    public static void main(String[] args) {
        Intr i1 = (n1, n2) -> {
            return n1 + n2;
        };

        Intr i2 = (n1, n2) -> n1 + n2;

        System.out.println(i1.add(10, 20));
        System.out.println(i2.add(50, 60));
    }
}

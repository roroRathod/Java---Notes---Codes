@FunctionalInterface
interface Intr {
    void add(int num1, int num2);
}

public class Main {
    public static void main(String[] args) {
        Intr i1 = (n1, n2) -> {
            System.out.println("The Result is " + (n1 + n2));
        };
        i1.add(10, 20);
    }
}

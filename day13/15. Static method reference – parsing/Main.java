@FunctionalInterface
interface Intr {
    int convertToNumber(String number);
}

public class Main {
    public static int fun1(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Intr i1 = Main::fun1;
        Intr i2 = Integer::parseInt;

        System.out.println(i1.convertToNumber("200"));
        System.out.println(i2.convertToNumber("500"));
    }
}

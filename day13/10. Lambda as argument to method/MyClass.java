interface Calculator {
    int calculate(int a, int b);
}

class MyClass {
    public static void main(String[] args) {
        Calculator plusOperation = (a, b) -> a + b;
        Calculator minusOperation = (a, b) -> a * b;

        System.out.println(plusOperation.calculate(10, 34));
        System.out.println(minusOperation.calculate(12, 5));
    }
}

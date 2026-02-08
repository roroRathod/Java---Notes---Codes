class Main {
    static void display(String... values) {
        System.out.println("display method invoked ");
        for (String s : values) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        display();
        display("my", "name", "is", "varargs");
    }
}


// Invalid var-args declarations

// void method(String... a, int... b);   // Compile-time error
// void method(int... a, String b);     // Compile-time error

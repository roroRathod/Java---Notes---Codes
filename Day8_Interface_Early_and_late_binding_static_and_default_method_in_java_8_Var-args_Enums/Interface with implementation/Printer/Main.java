package Printer;
// public class Main {
//     public static void main(String args[]) {
//         ConsolePrinter cp = new ConsolePrinter();
//         Printer p1 = new ConsolePrinter();
//         Printer p2 = new FilePrinter();

//         cp.print();
//         p1.print();
//         p2.print();
//     }
// }


// Passing interface reference as method parameter

public class Main {
    public static void printSomething(Printer p) {
        p.print();
    }

    public static void main(String[] args) {
        printSomething(new ConsolePrinter());
        printSomething(new FilePrinter());
        // printSomething(null); // NullPointerException
    }
}

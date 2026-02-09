import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> s = () -> "This is from Lambda Expression";
        System.out.println(s.get());

        Supplier<Student> s2 = () -> new Student(10, "Ram", 850);
        System.out.println(s2.get().getName());
    }
}

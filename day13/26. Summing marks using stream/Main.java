import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(10, "n1", 852));
        al.add(new Student(12, "n2", 854));

        int total = al.stream()
                .collect(Collectors.summingInt(s -> s.getMarks()));

        System.out.println(total);
    }
}

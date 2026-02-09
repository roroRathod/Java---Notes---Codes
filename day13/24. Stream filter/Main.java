import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Name1", 850));
        students.add(new Student(12, "Name2", 750));

        students.stream()
                .filter(s -> s.getMarks() > 800)
                .forEach(s -> System.out.println(s.getName()));
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(10, "n1", 852));
        al.add(new Student(12, "n2", 854));

        boolean result = al.stream().allMatch(s -> s.getMarks() > 800);
        System.out.println(result);
    }
}

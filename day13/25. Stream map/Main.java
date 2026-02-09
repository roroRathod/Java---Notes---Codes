import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ramesh");
        al.add("suresh");

        List<String> list = al.stream()
                .map(s -> "welcome " + s)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}

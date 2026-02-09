import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("one1");
        al.add("one2");

        Stream<String> ss = al.stream();
        ss.forEach(i -> System.out.println(i));
    }
}

import java.nio.file.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("nio.txt");
        Stream<String> lines = Files.lines(p);
        lines.forEach(System.out::println);
    }
}
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("nio.txt");
        Files.write(p, Arrays.asList("hello","java"));
    }
}
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> f = i -> "This is a number " + i;
        System.out.println(f.apply(10));

        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println(f2.apply("200") + 500);
    }
}

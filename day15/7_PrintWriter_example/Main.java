import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println(100);
        pw.println(true);
        pw.println("java");
        pw.close();
    }
}
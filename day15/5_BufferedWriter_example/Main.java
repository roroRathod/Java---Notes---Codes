import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.close();
    }
}
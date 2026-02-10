import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write("welcome to java\n");
        fw.write("file handling");
        fw.close();
    }
}
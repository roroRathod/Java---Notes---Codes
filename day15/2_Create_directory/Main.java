import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("myfiles");
        f.mkdir();
        System.out.println(f.exists());
    }
}
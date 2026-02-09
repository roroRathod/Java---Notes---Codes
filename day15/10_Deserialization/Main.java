import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois =
            new ObjectInputStream(new FileInputStream("data.txt"));
        A a = (A) ois.readObject();
        System.out.println(a.i);
        ois.close();
    }
}
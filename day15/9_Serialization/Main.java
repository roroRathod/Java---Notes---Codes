import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        A a = new A();
        ObjectOutputStream oos =
            new ObjectOutputStream(new FileOutputStream("data.txt"));
        oos.writeObject(a);
        oos.close();
    }
}
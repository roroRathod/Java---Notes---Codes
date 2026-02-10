import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1,22);
        ObjectOutputStream oos =
            new ObjectOutputStream(new FileOutputStream("s.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
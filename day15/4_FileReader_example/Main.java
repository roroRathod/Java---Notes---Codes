import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();
        while(i != -1){
            System.out.print((char)i);
            i = fr.read();
        }
        fr.close();
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("img.jpg");
        FileOutputStream fos = new FileOutputStream("img_copy.jpg");
        int i = fis.read();
        while(i != -1){
            fos.write(i);
            i = fis.read();
        }
        fis.close();
        fos.close();
    }
}
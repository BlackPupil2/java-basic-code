package demo07IoAndPropeties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\java黑马代码\\day16_code\\src\\demo07IoAndPropeties\\1.txt");
        f1.createNewFile();
        System.out.println(f1.exists());
        FileOutputStream fos = new FileOutputStream("D:\\java黑马代码\\day16_code\\src\\demo07IoAndPropeties\\1.txt");
        fos.write(97);
        fos.close();

    }

}

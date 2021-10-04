package demo08Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {


        FileOutputStream fos = new FileOutputStream("D:\\java黑马代码\\day16_code\\src\\demo08Reader\\b.txt");
        fos.write("你好".getBytes());
        fos.write("abc".getBytes());



    }
}

package demo07IoAndPropeties;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java黑马代码\\day16_code\\src\\demo07IoAndPropeties\\2.txt");
       int len=0;
       while ((len=fis.read())!=-1){
           System.out.print((char)len);
       }
        fis.close();
    }
}

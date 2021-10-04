package demo07IoAndPropeties;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java黑马代码\\day16_code\\src\\demo07IoAndPropeties\\2.txt",true);
      //  fos.write("你好".getBytes());
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}

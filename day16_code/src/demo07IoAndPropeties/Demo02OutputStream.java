package demo07IoAndPropeties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\java黑马代码\\day16_code\\src\\demo07IoAndPropeties\\2.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);


        byte[] bytes={65,66,67,68,69,70};
       // byte[] bytes={-65,-66,-67,-68,69,70};
        fos.write(bytes);
        fos.write(bytes,1,2);
        byte[] bytes2="你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);
        fos.close();
    }
}

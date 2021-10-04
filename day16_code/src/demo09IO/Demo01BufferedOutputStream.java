package demo09IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day16_code\\src\\demo09IO\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入内部缓冲区".getBytes());
        bos.flush();
        bos.close();



    }
}

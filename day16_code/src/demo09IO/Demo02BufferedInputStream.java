package demo09IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day16_code\\src\\demo09IO\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
     /*   int len=0;
        while ((len=bis.read())!=-1){
            System.out.println(len);
        }*/
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}

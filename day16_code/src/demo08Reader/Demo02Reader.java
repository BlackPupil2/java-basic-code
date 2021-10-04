package demo08Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\java黑马代码\\day16_code\\src\\demo08Reader\\b.txt");
      /*  int len=0;
        while ((len=fr.read())!=-1){
            System.out.println((char)len);
        }*/


        char[] cs = new char[1024];
        int len=0;
        while ((len=fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
        fr.close();

    }
}

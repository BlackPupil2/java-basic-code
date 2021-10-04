package demo06FileAndRecursion;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        File f1 = new File("D:\\java黑马代码\\day16_code\\src\\demo06FileAndRecursion\\1.txt");
        boolean b1 =f1.createNewFile();

        System.out.println(b1);

        File f2=new File("day16_code\\src\\demo06FileAndRecursion\\2.txt");
        System.out.println(f2.createNewFile());
    }
}

package demo06FileAndRecursion;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File f1 = new File("D:\\BaiduNetdiskDownload\\02-Java语进阶\\day09_字节流、字符流");
        System.out.println(f1.exists());
        File f3 = new File("a.txt");
        System.out.println(f3.exists());
    }
}

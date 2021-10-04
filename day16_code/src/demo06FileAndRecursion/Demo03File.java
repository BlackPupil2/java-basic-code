package demo06FileAndRecursion;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        File f1 = new File("D:\\java黑马代码\\day16_code\\src\\demo06FileAndRecursion\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);
        String path2 = f2.getPath();
        System.out.println(path2);
        System.out.println(f1);
        System.out.println(f1.toString());
    }

    private static void show01() {
        File f1 = new File("D:\\java黑马代码\\day16_code\\src\\demo06FileAndRecursion\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
}

package demo06FileAndRecursion;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        File file = new File("day16_code\\src\\demo06FileAndRecursion");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    private static void show01() {
        File file = new File("day16_code\\src\\demo06FileAndRecursion");
        String[] arr = file.list();
        for (String filename : arr) {
            System.out.println(filename);
        }
    }
}

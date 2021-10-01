package demo01Exception;

import java.io.FileNotFoundException;

/*异常处理的第一种方式*/
public class Demo05Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("d:\\a.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c");
        }
        System.out.println("无异常");
    }
}

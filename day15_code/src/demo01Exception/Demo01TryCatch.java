package demo01Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.tx");
        } catch (IOException e) {
         //   System.out.println("catch -传递的文件后缀不是txt");
         //   e.printStackTrace();
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
    public static void readFile(String fileName) throws IOException {
      /*  if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c");
        }*/
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("无异常");
    }
}

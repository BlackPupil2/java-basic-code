package cn.itcast.day04.demo03;

//打印指定次数的helloworld
public class Demo03MethodPrint {
    public static void main(String[] args) {
      printCoutnt(10);
    }
    /*
    * 三要素
    * 返回值类型
    * 方法名称
    * 参数列表*/
    public static void printCoutnt(int j) {
        for (int i = 1; i <= j; i++) {
            System.out.println("Hello World" + i);
        }
    }
}

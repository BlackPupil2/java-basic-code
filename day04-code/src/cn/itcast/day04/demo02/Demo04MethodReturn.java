package cn.itcast.day04.demo02;

/*题目要求：定义一个方法，用来求两个数字之和
  题目变形：定义一个方法，打印两个数字之和
    */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getsum(10, 20);
        System.out.println(num);
        System.out.println("========");
        printsum(100, 200);
    }

    public static int getsum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printsum(int a, int b) {
        int result = a + b;
        System.out.println("结果是" + result);
    }
}

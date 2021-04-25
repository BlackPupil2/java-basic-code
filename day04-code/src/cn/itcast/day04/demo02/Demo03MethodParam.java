package cn.itcast.day04.demo02;

/*有参数：小括号中有内容
无参数如打印固定十次，定义一个方法*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        System.out.println("=============");
        method2();
    }

    //乘法：有参数
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是" + result);
    }

    //打印输出固定10次文本字符串
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world" + i);
        }
    }
}

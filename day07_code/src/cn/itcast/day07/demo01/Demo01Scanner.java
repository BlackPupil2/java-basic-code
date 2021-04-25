package cn.itcast.day07.demo01;

import java.util.Scanner;

/*Scanner可以实现键盘输入
 * 只有java.lang不用导包*/
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
        String ss = sc.next();
        System.out.println("输入的字符是" + ss);
    }
}

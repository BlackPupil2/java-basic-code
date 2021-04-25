package cn.itcast.day07.demo01;
import java.util.Scanner;
public class demo02ScannerSum {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("a+b="+(num1+num2));
    }
}

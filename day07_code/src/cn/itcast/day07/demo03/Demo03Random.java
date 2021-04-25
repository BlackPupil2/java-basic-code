package cn.itcast.day07.demo03;
/*获取根据int N
* 的值来获取1到N，也可以取到n*/
import  java.util.Random;
import java.util.Scanner;
public class Demo03Random {
    public static void main(String[] args) {
        Random r=new Random();
        int n=new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            int num=r.nextInt(10)+1;
            System.out.print(num+" ");
        }

    }
}

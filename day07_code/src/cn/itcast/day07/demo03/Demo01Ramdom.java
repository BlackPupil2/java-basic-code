package cn.itcast.day07.demo03;
/*从0左闭右开*/
import java.util.Random;

public class Demo01Ramdom {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("随机数是："+num);
    }

}

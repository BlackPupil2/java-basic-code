package cn.itcast.day06.demo01;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("==================");
        //使用面向对象
        //使用jdk提供的方法toString，
        System.out.println(Arrays.toString(array));
    }

}

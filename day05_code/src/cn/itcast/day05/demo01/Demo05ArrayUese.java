package cn.itcast.day05.demo01;

import java.util.Arrays;

/*
* 动态初始化
* 整数类型时，默认值为0
* 浮点类型，默认为0.0
* 字符型，
* 布尔类型，
* 应用类型
* 静态初始化也有默认值过程，但被指定值修改了
* 动态初始化数组时会有一个默认值
* 布尔类型为false
* 引用类型为null*/
public class Demo05ArrayUese {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayA=new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=========");
        arrayA[1]=123;
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);


    }
}

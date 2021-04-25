package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*数组长度不可以改变
* Arraylist可以改变
* <E>代表泛型*/
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个集合
        ArrayList<String> List  =new ArrayList<>();
        List.add("小明");


        System.out.println(List);

    }

}

package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("宋远桥");
        list.add("高圆圆");
        System.out.println(list);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("(");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(i==list.size()-1){
                System.out.println(")");
            }else {
            System.out.print(name+"@");}
        }
    }
}

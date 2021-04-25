package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStuent {
    public static void main(String[] args) {
        ArrayList<Stuent> list=new ArrayList<>();
        Stuent one=new Stuent("洪七公",20);
        Stuent two=new Stuent("看看看",22);
        Stuent three=new Stuent("洪把公",33);
        Stuent four=new Stuent("洪九公",44);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Stuent stu=list.get(i);
            System.out.println();
        }
    }
}

package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*ArrayList常用方法
* public boolean add(E e)向集合中添加元素
* public E get(int index)
* public E remove(int index) 删除元素
* publci int size()获取尺寸长度*/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        boolean success =list.add("小明");
        System.out.println(list);
        System.out.println(success);

    }

}

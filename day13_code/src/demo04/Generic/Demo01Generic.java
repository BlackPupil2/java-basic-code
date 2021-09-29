package demo04.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }

    }

    private static void show01() {
        ArrayList list=new ArrayList();
        list.add("ava");
        list.add(1);

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
            String s=(String)obj;
            System.out.println(s.length());
        }
    }
}

package demo01;

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
        /*person默认继承了obj类*/
        Person p1=new Person("李四",22);
        Person p2=new Person("李四",22);
      //  Person p2=new Person("张三",23);
      //  p1=p2;
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);


        Random r=new Random();

//        boolean b=p1.equals(r);
        boolean b=p1.equals(null);
        System.out.println(b);
    }
}

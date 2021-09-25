package demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }
    /*Date类成员方法
    * long getTime()日期转为毫秒*/
    private static void demo03(){
            Date date=new Date();
            long time=date.getTime();
        System.out.println(time);  //1632539845203
    }


    /*  Date(long date)*/
    private static void demo02(){
        Date d1=new Date(0L);
        System.out.println(d1);
        Date d2= new Date(158111111111L);
        System.out.println(d2);
    }


    /*
    * date类空参数构造方法*/
    private static void demo01(){
        Date date=new Date();
        System.out.println(date); //Sat Sep 25 11:12:57 CST 2021

    }
}

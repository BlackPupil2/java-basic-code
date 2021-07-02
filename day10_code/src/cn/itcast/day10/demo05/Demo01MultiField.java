package cn.itcast.day10.demo05;
/*
* 访问成员变量的两种方式
* 1.直接通过名称访问，看等号左边是谁，没有就往上找
* 2.间接通过方法访问,看该方法属于谁，优先用谁，没有就往上找*/
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj=new Zi();
        System.out.println(obj.num);
        //错误写法 System.out.println(obj.age);
        System.out.println("==================");
        obj.showNum();
        //子类如果没有覆盖重写，就是父
    }
}

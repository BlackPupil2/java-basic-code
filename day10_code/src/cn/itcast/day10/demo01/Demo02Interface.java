package cn.itcast.day10.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs();//调用了抽象方法
        a.methodDefault();//调用了默认方法
        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}

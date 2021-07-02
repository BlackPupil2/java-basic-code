package cn.itcast.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("B覆盖重写了接口的默认方法");
    }
}

package cn.itcast.day10.demo01;
/*
* 接口就是多个类的公共规范
* 接口是一种引用数据类型，抽象方法是最重要的
* 定义一个接口的格式：
* public interface 接口名称{
*
* }
* 备注：换成interface后，编译生成的字节码文件仍然是.java --> .class*/
public class Demo01Interface {
    public static void main(String[] args) {
       MyInterfaceAbstractImpl impl =new MyInterfaceAbstractImpl();
       impl.methodAbs();
    }
}

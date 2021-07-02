package cn.itcast.day10.demo02;

public interface MyInterfaceA {
    /*接口不能有静态模块
    * static{
    * }*/
    //接口不能有构造方法
    /*
     * 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口*/
    public abstract void methodA();
    /*
    * 如果实现类有重复的抽象方法，那么只需要覆盖重写一次*/
    public default void methodDefault(){
        System.out.println("默认方法AA");
    }
    /*继承优先于接口*/
}

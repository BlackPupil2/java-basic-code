package cn.itcast.day10.demo01;
/*
* 需要抽取一个共有方法，来解决两个默认方法直接重复代码
* 从java9开始
* 接口允许定义私有方法：
* 1.普通私有
* private
* 2.静态私有,解决多个静态方法重复代码
* private static*/
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
    }
    private  void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
    }
}

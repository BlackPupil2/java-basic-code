package cn.itcast.day10.demo01;
/*
* 从java8开始，接口里允许定义默认方法
* public default 返回值类型 方法名称{}
*
* 备注：接口中的默认方法可以解决接口升级的问题*/
public interface MyInterfaceDefault {
       public abstract  void methodAbs();
//    public abstract void methodAbs2();
    //默认方法
    public default void methodDefault(){
        System.out.println("新添加的默认方法");
    }
}

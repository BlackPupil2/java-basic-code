package cn.itcast.day10.demo01;
/*
* 在任何版本的java中接口都可以定义抽象方法
* public abstract 返回值类型 方法名称
* 注意事项：
* 接口当中的抽象方法，修饰符固定
* 接口使用步骤：
* 1.接口不能直接使用，必须要有实现类来实现接口
* public class 实现类名称 implements 接口名称{}
* 2.接口的实现类必须覆盖重写抽象方法*/
public interface MyInterfaceAbstract {
    public abstract  void methodAbs();
}

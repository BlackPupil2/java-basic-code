package cn.itcast.day10.demo03;
/*这个子接口中有4个方法
* 多个父接口当中的抽象方法重复没关系
* 默认方法重复就有问题,子接口必须进行覆盖重写,而且要带着default关键字*/
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
        public abstract void method();

        @Override
        public default void methodDefault() {

        }
}

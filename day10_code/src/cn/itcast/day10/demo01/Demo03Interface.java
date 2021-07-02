package cn.itcast.day10.demo01;
/*静态方法不能使用实现类对象来调用*/
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl=new MyInterfaceStaticImpl();
     /*错误写法*/
        //impl.methodStatic();
        //直接接口名称来调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}

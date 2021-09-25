package cn.itcast.day11.demo01;
/*public final class 类名称*/
/*当前这个类不能有任何的子类,但是有父类*/
/*一个类如果是final,那么其中的所有成员方法无法覆盖重写(因为没有子类)*/
public final class MyClass {
    public  void method(){
        System.out.println("方法执行");
    }
}

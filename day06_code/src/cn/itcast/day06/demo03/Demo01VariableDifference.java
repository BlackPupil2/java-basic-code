package cn.itcast.day06.demo03;

/*局部变量和成员变量
 * 1.定义的位置不一样
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类中
 * 2.作用的范围不一样
 * 局部变量：只有在方法中可以使用，出了方法就不可以用
 * 成员变量：整个类都可以通用
 * 3.默认值不一样
 * 局部变量：要手动赋值
 * 4.内存的位置不一样
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存*/
public class Demo01VariableDifference {
    String name;

    public void method() {
        int num = 20;
    }

    public void method(int param) {
        System.out.println(param);
        //参数在方法调用的时候，必然会被赋值
    }
}

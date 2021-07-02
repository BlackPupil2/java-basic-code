package cn.itcast.day10.demo05;
/*成员方法中看new的是谁
* 编译看左边，运行看右边
* 成员变量 编译运行都看左边*/
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();
        obj.methodFu();
//       编译 左边 Fu中没有methodZi方法 所以报错
    //   obj.methodZi(); 错误方法
    }
}

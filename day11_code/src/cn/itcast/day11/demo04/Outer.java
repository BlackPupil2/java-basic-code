package cn.itcast.day11.demo04;
/*类是定义在一个方法里面，局部内部类*/
public class Outer {
    public void methodOuter(){
        class Inner{ //局部内部类
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
    }

}

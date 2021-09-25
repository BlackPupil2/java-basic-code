package cn.itcast.day11.demo04;
/*
* 如果希望访问所在方法的局部变量，那么这个局部变量必须是有效final*/
public class MyOuter {
    public void methodOuter(){
        final int num=10; //所在方法的局部变量

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}

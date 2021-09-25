package cn.itcast.day11.demo05;

public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl impl =new MyInterfaceImpl();
//        impl.method();
        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        obj.method();
    }
}

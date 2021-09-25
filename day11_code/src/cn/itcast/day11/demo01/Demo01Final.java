package cn.itcast.day11.demo01;
//常见有四种用法
public class Demo01Final {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);
        num1=20;
        System.out.println(num1);

        final int num2=200;
        //final修饰的局部变量，那么变量不能修改


       Student stu1=new Student("zhao");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1=new Student("huo");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        final Student stu2=new Student("gao");
        stu2.setName("zahh");
        System.out.println(stu2.getName());
    }
}

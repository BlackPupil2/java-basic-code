package cn.itcast.day06.demo04;

public class Demo02Stuent {
    public static void main(String[] args) {
        Stuent stu1 = new Stuent();
        Stuent stu2 = new Stuent("小明", 20);
        System.out.println("姓名"+stu2.getName()+"年龄是："+stu2.getAge());
    }
}

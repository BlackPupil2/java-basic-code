package cn.itcast.day06.demo03;

public class Demo04Stuent {
    public static void main(String[] args) {
        Stuent stu=new Stuent();
        stu.setName("陆就");
        stu.setAge(11);
        stu.setMale(true);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.isMale());
    }
}

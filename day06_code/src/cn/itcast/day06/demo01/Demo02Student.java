package cn.itcast.day06.demo01;
/*需要根据类先创建一个对象
 * 1.导包，指出所需要使用的类，在什么位置
 * import 包名称.类名称;
 * import cn.itcast.day06.demo01.stuent
 * 对于与当前类属于同一个包的情况，可以省略导包语句
 * 2.创建,格式
 * 类名称 对象名= new 类名称()
 * Stuent stu=new Stuent();
 * 3.使用分为两种情况
 * 使用成员变量
 * 使用成员方法 对象名.成员方法（参数）*/

public class Demo02Student {
    public static void main(String[] args) {
        Stuent stu = new Stuent();
        System.out.println(stu.name); //null
        System.out.println(stu.age);    //0
        stu.name = "小明";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
    }
}

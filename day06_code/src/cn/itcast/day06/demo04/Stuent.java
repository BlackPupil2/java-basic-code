package cn.itcast.day06.demo04;

/*构造方法不要写返回值，连void都不写
 * 构造方法不能return一个具体的值
 * 如果没有编写任何构造方法，那么编译器会默认赠送一个无参数无方法的构造方法
 * 构造方法可以重载
 * 一旦编写至少一个构造方法，编译器不再赠送*/
public class Stuent {
    private String name;
    private int age;
    public Stuent() {
        System.out.println("无参构造方法执行了");
    }

    public Stuent(String name, int age) {
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }
//Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

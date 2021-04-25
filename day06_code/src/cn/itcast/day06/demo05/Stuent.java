package cn.itcast.day06.demo05;

/*标准类
 * 所有成员都要用private修饰
 * 为每一个成员编写getset方法
 * 编写无参构造方法
 * 编写全参构造方法*/
public class Stuent {
    private String name;
    private int age;

    public Stuent() {
    }

    public Stuent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

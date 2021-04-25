package cn.itcast.day06.demo03;

/*
 * private 不能直接访问
 * 间接访问setget方法
 * set不能有返回值
 * get不能有参数*/
public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫" + name + "年龄" + age);
    }

    //这个成员方法专门用于向age设置数据
    public void setAge(int num) {
        if (age < 100 && age > 0) {
            age=num;
        } else {
            System.out.println("不合理");
        }
    }

    //专门用于获取age
    public int getAge() {
        return age;
    }
}

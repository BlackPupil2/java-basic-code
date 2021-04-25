package cn.itcast.day06.demo04;
/*当方法的局部变量与类的成员变量重名时
* 根据就近原则，优先使用局部变量
* this可以访问成员变量
* 通过谁调用，谁就是this*/
public class Demo01Person {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="小王";
        person.sayHello("小明");
        System.out.println(person);
    }
}

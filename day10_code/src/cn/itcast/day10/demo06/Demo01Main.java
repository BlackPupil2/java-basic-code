package cn.itcast.day10.demo06;
/*对象的向下转型
* 还原
* 父类还原成子类
* 子类名称 对象名=（子类名称） 父类对象*/
public class Demo01Main {
    public static void main(String[] args) {
        Animal a1=new Cat();
        a1.eat();
        Cat cat=(Cat) a1;
        cat.eat();
    }

}

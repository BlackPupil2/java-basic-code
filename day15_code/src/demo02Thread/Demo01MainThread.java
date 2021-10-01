package demo02Thread;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        Person p2 = new Person("小小");
        p2.run();
    }
}

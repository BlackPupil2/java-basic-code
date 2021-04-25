package cn.itcast.day07.demo02;
/*匿名对象是只有右边的对象，没有左边的名字*/
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one=new Person();
        one.name="高圆圆";
        one.showname();
        System.out.println("=================");
        //匿名对象
        new Person().name="赵";

    }
}

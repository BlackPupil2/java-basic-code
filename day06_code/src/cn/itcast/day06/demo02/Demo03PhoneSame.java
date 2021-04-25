package cn.itcast.day06.demo02;

public class Demo03PhoneSame {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 888;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=================");
        one.call("乔布斯");
        one.sendmessage();
        System.out.println("=================");

        Phone two = one;
        two.brand = "三星";
        two.price = 888;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("=================");
        two.call("欧巴");
        two.sendmessage();
    }
}

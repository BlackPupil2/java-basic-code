package cn.itcast.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println(two.brand);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 2222;
        one.color = "玫瑰金";
        return one;
    }
}

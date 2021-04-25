package cn.itcast.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
    Phone one=new Phone();
    one.brand="苹果";
    one.price=9333;
    one.color="金色";
    method(one);//传递了地址进去
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}

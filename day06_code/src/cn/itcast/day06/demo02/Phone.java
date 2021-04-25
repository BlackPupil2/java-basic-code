package cn.itcast.day06.demo02;
/*
* 属性：品牌，价格，颜色
* 行为：打电话，发短信*/
public class Phone {
    String brand;
    double price;
    String color;
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendmessage(){
        System.out.println("群发短信");
    }


}

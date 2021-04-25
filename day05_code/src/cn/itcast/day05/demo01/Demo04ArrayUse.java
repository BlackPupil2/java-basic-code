package cn.itcast.day05.demo01;
/*
* 访问数组元素的格式，数组名称【索引值】
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30};
        // [I@7c30a502 @后面是16进制
        System.out.println(arrayA[0]);
        System.out.println("========");
        int num=arrayA[1];
        System.out.println(num);
    }
}

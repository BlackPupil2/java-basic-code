package cn.itcast.day08.demo01;
/*字符串是常量,在创建后不能修改
* 所以字符串是可以共享使用
* 常见3+1种方法
* public String()创建一个空白字符串
* public String(char[] array):根据字符数组的内容，来创建对应的字符串
* public String(byte[] array)
* 直接创建
* */
public class Demo01String {
    public static void main(String[] args) {
        String str1=new String();
        System.out.println(str1);
        char[] charArray={'a','b','c'};
        String str2=new String(charArray);
        System.out.println(str2);
        byte[] byteArra={97,98,99};
        String str3=new String(byteArra);
        System.out.println(str3);
    }
}

package cn.itcast.day08.demo02;
/*public int length()拿到字符串的长度
public String concat(String str)拼接字符串
public char charAt(int Index)获取索引的单个字符
public int indexOf(String str)
* */
public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "asdasdasdqwe2asd".length();
        System.out.println(length);

        String str1="hello";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str3);
        char c = "Hello".charAt(1);
        System.out.println(c);
        String original="HelloWorld";
        int llo = original.indexOf("llo");
        System.out.println(llo);
    }
}

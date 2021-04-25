package cn.itcast.day08.demo02;
/*字符串比较
* public boolean equals(Object obj)
* 推荐写常量在前*/
public class Demo01StringEqual {
    public static void main(String[] args) {
    String str1="hello";
    String str2="hello";
    char[] charArray={'h','e','l','l','o'};
    String str3=new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));
        String str5="abc";
        System.out.println("abc".equals(str5));
    }
}

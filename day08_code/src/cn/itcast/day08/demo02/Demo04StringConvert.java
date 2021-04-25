package cn.itcast.day08.demo02;

/*字符串转换
 * public char[] toCharArray()将当前字符串拆分成字符数组作为返回值
 * public byte[] getBytes()
 * public String replace(CharSequence oldString,CharSequence newString)*/
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str2);
        System.out.println("22");

    }
}

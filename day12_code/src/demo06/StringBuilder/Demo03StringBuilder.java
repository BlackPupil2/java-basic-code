package demo06.StringBuilder;

public class Demo03StringBuilder {
    public static void main(String[] args) {
        String str="hello";
        System.out.println("str"+str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println("bu"+bu);
        String s=bu.toString();
        System.out.println(s);
    }
}

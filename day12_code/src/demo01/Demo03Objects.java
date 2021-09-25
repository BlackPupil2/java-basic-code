package demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1=null;
        String s2="aaa";
  //      boolean b=s1.equals(s2);
    //    System.out.println(b);
        boolean b2= Objects.equals(s1,s2);
        System.out.println(b2);
    }
}

package demo03.foreach;

import java.util.ArrayList;

public class Demo02Foreach {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        for (String s:list
             ) {
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[] arr={1,2,3,4,6};
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
}

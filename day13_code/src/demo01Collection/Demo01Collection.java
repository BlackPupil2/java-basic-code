package demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        System.out.println(coll);
        boolean b=  coll.remove("hello");
        System.out.println(b);
        System.out.println(coll);
    }
}

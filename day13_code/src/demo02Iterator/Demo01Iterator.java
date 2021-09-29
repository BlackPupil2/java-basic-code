package demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*迭代器*/
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("妖魔");
        coll.add("科比");
        /*获取迭代器*/
        Iterator<String> it = coll.iterator();
        boolean b = it.hasNext();
        System.out.println(b);

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }

}

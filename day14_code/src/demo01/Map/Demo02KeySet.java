package demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵",168);
        map.put("越",162);
        map.put("钱",163);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(value);
        }
        for (String key :
                map.keySet()) {
            Integer value = map.get(key);
            System.out.println(value);
        }
    }
}

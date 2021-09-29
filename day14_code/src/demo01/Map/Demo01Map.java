package demo01.Map;

import java.util.HashMap;

public class Demo01Map {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        HashMap<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println(v1);
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println(v2);
        System.out.println(map);
    }
}

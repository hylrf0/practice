package thinkinjava.demo.seventeen;

import java.util.LinkedHashMap;

/**
 * Created by linrufeng on 2017/4/28.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(0, "A0");
        linkedHashMap.put(1, "B0");
        linkedHashMap.put(2, "C0");
        linkedHashMap.put(3, "D0");
        linkedHashMap.put(4, "E0");
        linkedHashMap.put(5, "F0");
        linkedHashMap.put(6, "G0");
        linkedHashMap.put(7, "H0");
        linkedHashMap.put(8, "I0");
        System.out.println(linkedHashMap);

        LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<Integer, String>(16, 0.75f, true);
        linkedHashMap1.putAll(linkedHashMap);
        System.out.println(linkedHashMap1);

        for (int i = 0; i < 6; i++) {
            linkedHashMap1.get(i);
        }
        System.out.println(linkedHashMap1);
        linkedHashMap1.get(0);
        System.out.println(linkedHashMap1);
    }
}

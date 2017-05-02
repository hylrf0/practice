package thinkinjava.demo.seventeen;

import java.util.*;

/**
 * Created by linrufeng on 2017/4/28.
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> collection = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> collection1 = new ArrayList<String>(subList);
        try {
            collection.retainAll(collection1);
        } catch (Exception e) {
            System.out.println("retainAll():" + e);
        }
        try {
            collection.removeAll(collection1);
        } catch (Exception e) {
            System.out.println("removeAll():" + e);
        }
        try {
            collection.clear();
        } catch (Exception e) {
            System.out.println("clear():" + e);
        }
        try {
            collection.add("X");
        } catch (Exception e) {
            System.out.println("add():" + e);
        }
        try {
            collection.retainAll(collection1);
        } catch (Exception e) {
            System.out.println("retainAll():" + e);
        }
        try {
            collection.addAll(collection1);
        } catch (Exception e) {
            System.out.println("addAll():" + e);
        }
        try {
            collection.remove("C");
        } catch (Exception e) {
            System.out.println("remove():" + e);
        }
        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("list.set():" + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}

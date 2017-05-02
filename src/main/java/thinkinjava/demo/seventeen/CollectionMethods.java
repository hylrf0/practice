package thinkinjava.demo.seventeen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by linrufeng on 2017/4/28.
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("ten");
        collection.add("eleven");
        System.out.println(collection);

        Object[] array = collection.toArray();
        String[] str = collection.toArray(new String[0]);
        System.out.println("Collections.max(c) = " + Collections.max(collection));
        System.out.println("Collections.min(c) = " + Collections.min(collection));

        Collection<String> collection1 = new ArrayList<String>();
        collection1.add("one");
        collection1.add("two");
        collection.addAll(collection1);
        System.out.println(collection);
        collection.remove("one");
        System.out.println(collection);
        collection.remove("two");
        System.out.println(collection);

        collection.addAll(collection1);
        collection.removeAll(collection1);
        System.out.println(collection);


        System.out.println("collection.containsAll(collection1) = " + collection.containsAll(collection1));
    }
}

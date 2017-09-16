package thinkinjava.demo.seventeen;

import org.apache.tools.ant.taskdefs.PathConvert;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Created by linrufeng on 2017/4/28.
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    static final int SIZE = 997;

    @SuppressWarnings("unchecked")
//    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}

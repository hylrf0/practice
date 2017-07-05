package jvm.two;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by linrufeng on 2017/6/5.
 */
public class DirectMemoryOOM {

    private static final int _1MB= 1024 * 1024;

    public static void main(String[] args) {
        Field unsafField = Unsafe.class.getDeclaredFields()[0];
        unsafField.setAccessible(true);
        try {
            Unsafe unsafe = (Unsafe) unsafField.get(null);
            while (true) {
                unsafe.allocateMemory(_1MB);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

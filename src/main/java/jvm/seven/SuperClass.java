package jvm.seven;

/**
 * Created by linrufeng on 2017/8/30.
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}

class NotInitialization {
    public static void main(String[] args) {
//        System.out.println(SubClass.value);
        SuperClass superClass[] = new SuperClass[10];
    }
}

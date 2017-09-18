package demo.exercises.one;

/**
 * Created by Administrator on 2017/2/23 0023.
 */
public class Seven {
    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}
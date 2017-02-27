package thinkinjava.exercises.two;

/**
 * Created by linrufeng on 2017/2/26.
 * 对于基本类型的成员变量，java会对其进行默认初始化
 */
public class One {

    private int i;
    private short s;
    private char c;
    private long l;

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one.i);
        System.out.println(one.s);
        System.out.println(one.c);
        System.out.println(one.l);
    }
}

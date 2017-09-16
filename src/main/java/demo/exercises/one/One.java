package demo.exercises.one;

/**
 * Created by Administrator on 2017/2/23 0023.
 * 对于基本类型成员变量，java会对其进行默认初始化
 */
public class One {

    private int i;
    private char c;

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one.i);
        System.out.println(one.c);
    }
}

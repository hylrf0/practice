package other.test;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class OperatorTest {

    public static void main(String[] args) {
        //左位移运算符
        Integer num = 3;
        System.out.println("num:" + num);
        System.out.println("二进制num:" + Integer.toBinaryString(num));

        num <<= 1;
        System.out.println("左移一位后:" + num);
        System.out.println("左移一位后二进制:" + Integer.toBinaryString(num));

        num = 3;
        num <<= 2;
        System.out.println("左移两位后:" + num);
        System.out.println("左移两位后二进制:" + Integer.toBinaryString(num));
    }
}

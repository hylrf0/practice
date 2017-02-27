package thinkinjava.demo.three;

import static other.test.Print.print;
/**
 * Created by linrufeng on 2017/2/27.
 * 将float或double转型为整型值时，总是对该数字执行截尾
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("(int)above: " + (int)above);
        print("(int)below: " + (int)below);
        print("(int)fabove: " + (int)fabove);
        print("(int)fbelow: " + (int)fbelow);
    }
}

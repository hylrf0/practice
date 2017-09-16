package demo.exercises.one;

/**
 * Created by Administrator on 2017/2/23 0023.
 */
public class Six {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Six six = new Six();
        System.out.println(six.storage("zxcv"));
    }
}

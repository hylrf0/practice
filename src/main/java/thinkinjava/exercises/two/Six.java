package thinkinjava.exercises.two;

/**
 * Created by linrufeng on 2017/2/26.
 */
public class Six {

    int storage(String s) {return s.length() * 2;}

    public static void main(String[] args) {
        Six six = new Six();
        System.out.println(six.storage("xzcv"));
    }
}

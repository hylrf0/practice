package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/28.
 */
public class Nineteen {

    public Nineteen(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new Nineteen("one", "two", "three");
        System.out.println("-----------------------");
        new Nineteen(new String[]{"1a", "2b", "3c"});
    }
}

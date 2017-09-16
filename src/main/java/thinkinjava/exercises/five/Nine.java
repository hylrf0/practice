package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/27.
 */
public class Nine {

    private String str;
    public Nine() {
        this("init");
    }

    public Nine(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Nine nine = new Nine();
        System.out.println(nine.str);
    }
}

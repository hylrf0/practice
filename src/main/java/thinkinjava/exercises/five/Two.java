package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/27.
 * 创建一个类，它包含一个在定义时就被初始化了的String域和另一个通过构造器初始化的String域。这两种方式有何差别？
 * 定义时就被初始化了的String会在被new的时候定义两次。
 */
public class Two {
    private String initOne = "initOne";
    private String initTwo;

    public Two() {
        initOne = "reinited";
        initTwo = "initTwo";
    }

    public static void main(String[] args) {
        Two two = new Two();
        System.out.println(two.initOne);
        System.out.println(two.initTwo);
    }
}

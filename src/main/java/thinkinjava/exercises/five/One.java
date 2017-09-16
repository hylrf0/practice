package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/27.
 * 创建一个类，它包含一个未初始化的String引用。验证该引用被Java初始化成了null
 */
public class One {

    private String unInit;

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one);
    }
}

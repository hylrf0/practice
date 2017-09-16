package other.test;

import thinkinjava.exercises.eleven.Fifteen;

import javax.swing.Timer;
import java.util.*;
import java.util.function.BiFunction;

/**
 * Created by linrufeng on 2017/9/15.
 */
public class LambdaTest {

    public void hahaha(String string, Ttttt ttttt) {
        ttttt.execute();
    }


    public static void main(String[] args) {
        Comparator<String> comparator = (String first, String second) -> {
            return first.length() - second.length();
        };
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcbcxz");
        list.add("abcadsfadsf");
        list.add("abcfds");
        list.add("abcfdsds");
        list.add("abcfdsfd");

        Collections.sort(list, comparator);

        System.out.println(list.toString());

        list.removeIf(e -> e == null);

        Timer timer = new Timer(1000, System.out::println);
//        timer.start();

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.hahaha("123", () -> System.out.println("bbb"));
    }
}

interface Ttttt {
    void execute();
}

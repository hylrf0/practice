package thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by linrufeng on 2017/10/2.
 */
public class ThreadTest {

    public static AtomicInteger largest = new AtomicInteger();

    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
////        thread.setUncaughtExceptionHandler((t, e) -> {
////            System.out.println(t.getId());
////            e.printStackTrace();
////        });
//
//        thread.run();

        largest.accumulateAndGet(100, Math::max);
        largest.updateAndGet(x -> Math.max(x, 100));

        List features = Arrays.asList(1, 2, 3, 4, 5);

        features.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        features.forEach(x -> System.out.println(x));

        features.forEach((a) -> System.out.println(Math.max(Integer.parseInt(a.toString()), 20)));
    }

}

package thinkinjava.demo.twentyone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by linrufeng on 2017/4/27.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0 ; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}

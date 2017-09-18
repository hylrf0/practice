package other.test;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by linrufeng on 2017/9/18.
 */
public class HttpTest {

    public static void main(String[] args) {
        String[] arrays = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] passes = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@"};

        Random random = new Random();
        Integer count = 0;

        //创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 300, 3,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(30),
                new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.execute(new Task());
    }
}

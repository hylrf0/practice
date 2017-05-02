package thinkinjava.demo.twentyone;

/**
 * Created by linrufeng on 2017/4/27.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("waiting for LiftOff");
    }
}

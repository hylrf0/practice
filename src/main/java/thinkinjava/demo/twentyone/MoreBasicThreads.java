package thinkinjava.demo.twentyone;

/**
 * Created by linrufeng on 2017/4/27.
 */
public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i=0; i<1000; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}

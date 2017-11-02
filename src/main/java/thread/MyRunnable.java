package thread;

/**
 * Created by linrufeng on 2017/10/2.
 */
public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("done");
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("bbbb");
    }
}

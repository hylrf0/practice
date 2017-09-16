package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/28.
 */
public class Ten {

    public static void main(String[] args) {
        Ten ten = new Ten();
        ten.finalize();
        System.gc();
    }

    protected void finalize() {
        System.out.println("message");
//        try {
//            super.finalize();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
    }
}

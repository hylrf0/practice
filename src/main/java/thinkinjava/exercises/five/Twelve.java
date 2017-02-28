package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/28.
 * 对于存在引用的对象，不会调用finalize()，如果存在一个对象没有对象的引用，那么显示的调用System.gc()时会触发finalize();
 */
public class Twelve {

    /**
     * 0:empty   1:full
     */
    private int status = 1;

    protected void finalize() {
        if (status == 1) {
            System.out.println("Error: object is not empty");
//            try {
//                super.finalize();
//            } catch (Throwable throwable) {
//                throwable.printStackTrace();
//            }

        }
    }

    public void fullTank() {
        this.status = 1;
    }

    public void emptyTank() {
        this.status = 0;
    }

    public static void main(String[] args) {
        Twelve twelve = new Twelve();
        twelve.fullTank();
        new Twelve();
        System.gc();
        System.out.println("-----------------------------");
        twelve.emptyTank();
        System.gc();
    }
}
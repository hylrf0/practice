package demo.nine;

/**
 * Created by linrufeng on 16/5/4.
 */
public class Practice3 extends Base {
    private int i = 10;
    public void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Practice3 p = new Practice3();
        p.print();
    }
}

abstract class Base {
    public Base() {
        print();
    }
    public abstract void print();
}

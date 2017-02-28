package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/28.
 * 17题和18题
 */
public class Seventeen {

    public Seventeen(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Seventeen[] seventeens = new Seventeen[10];
        for (int i=0; i<10; i++) {
            Seventeen seventeen = new Seventeen("str" + i);
            seventeens[i] = seventeen;
        }
    }
}

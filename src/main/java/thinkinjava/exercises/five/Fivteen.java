package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/28.
 */
public class Fivteen {

    private String s1;
    private String s2;

    {
        s1 = "s1init";
        s2 = "s2init";
    }

    public static void main(String[] args) {
        Fivteen fivteen = new Fivteen();
        System.out.println(fivteen.s1);
        System.out.println(fivteen.s2);
    }
}

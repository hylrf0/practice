package thinkinjava.exercises.six;

/**
 * Created by linrufeng on 2017/3/8.
 */
public class Eight extends Base{

    Eight(int i) {
        super(i);

    }

    Eight() {
        super(10);
    }
}

class Base{
    Base(int i) {
        System.out.println("Base constructor " + i);
    }
}

package thinkinjava.exercises.eight;

/**
 * Created by linrufeng on 2017/3/13.
 */
public class BaseObject {

    public void first() {
        System.out.println("BaseObject first");
        second();
    }

    public void second() {
        System.out.println("BaseObject second");
    }

    public static void main(String[] args) {
        BaseObject baseObject = new ExtendsObject();
        baseObject.first();
    }
}

class ExtendsObject extends BaseObject {
    public void second() {
        System.out.println("ExtendsObject second");
    }
}

package thinkinjava.exercises.six;

/**
 * Created by linrufeng on 2017/3/8.
 */
public class Four {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A{
    B() {
        System.out.println("B constructor");
    }
}

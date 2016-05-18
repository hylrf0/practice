package seven;

/**
 * Created by linrufeng on 16/4/28.
 * 类中素有的private方法都隐式的指定为是final的,可以对private方法添加final修饰符,但是没有任何额外的意义.
 * 如果在导出类中以相同的名义生成一个pubic,protected的方法,仅是生成了一个新的方法,并不是覆盖.
 * 覆盖必须是能将一个对象向上转型为它的基本类型并调用相同的方法.
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
    }
}

class WithFinals {
    private final void f() {
        System.out.println("WithFinals.f()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }

    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f(){
        System.out.println("OverridingPrivate.f()");
    }

    public void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

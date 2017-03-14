package other.test;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a.aa);
    }
}
//------------
class B {
    public final A a = new A(this);
    public final int num = 100;
}
//-----------
class A {

    public final int aa;
    public A(B b){
        aa = b.num;
    }
}

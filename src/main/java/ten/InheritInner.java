package ten;

/**
 * Created by linrufeng on 16/5/24.
 * 内部类的继承
 * P212
 */
public class InheritInner extends WithInner.Inner {
  InheritInner(WithInner wi) {
    wi.super();
  }

  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }
}

class WithInner {
  class Inner {}
}
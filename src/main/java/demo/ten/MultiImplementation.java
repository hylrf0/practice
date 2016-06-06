package demo.ten;

/**
 * Created by linrufeng on 16/5/19.
 * 使用内部类可以实现多重继承
 * P205
 */
public class MultiImplementation {
  static void takesD(D d){}
  static void takesE(E e){}

  public static void main(String[] args) {
    Z z = new Z();
    takesD(z);
    takesE(z.makeE());
  }
}

class D {}
abstract class E {}
class Z extends D {
  E makeE() {return new E() {};}
}
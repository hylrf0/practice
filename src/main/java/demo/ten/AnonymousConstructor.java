package demo.ten;

/**
 * Created by linrufeng on 16/5/19.
 * 匿名类中不可能有命名构造器(因为没名字)
 */
public class AnonymousConstructor {
  public static Base getBase(int i) {
    return new Base(i) {
      {
        System.out.println("Inside instance initializer");
      }
      public void f() {
        System.out.println("In anonymous f()");
      }
    };
  }

  public static void main(String[] args) {
    Base base = getBase(47);
    base.f();
  }
}

abstract class Base {
  public Base(int i) {
    System.out.println("Base constructor, i = " + i);
  }
  public abstract void f();
}

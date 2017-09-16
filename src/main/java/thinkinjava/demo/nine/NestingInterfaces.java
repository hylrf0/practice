package thinkinjava.demo.nine;

/**
 * Created by linrufeng on 16/5/13.
 * P185
 * 接口中不允许出现private,因为接口中的方法就是为了实现而定义的.
 */
public class NestingInterfaces {
  public class BImp implements A.B {
    public void f() {}
  }
  class CImp implements A.C {
    public void f() {}
  }
  class EImp implements E {
    public void g() {}
  }
  class EGImp implements E.G{
    public void f() {}
  }
  class EImp2 implements E {
    public void g() {}
    class EG implements E.G{
      public void f() {}
    }
  }

  public static void main(String[] args) {
    A a = new A();
    A a2 = new A();
    a2.received(a.getD());
    A.BImp bImp = a.new BImp();//没有静态(static)的类中类不能使用外部类进行.操作,必须用实例来进行实例化类中类.
  }
}

class A {
  interface B {
    void f();
  }
  public class BImp implements B{
    public void f(){}
  }

  private class BImp2 implements B {
    public void f() {}
  }

  public interface C {
    void f();
  }

  class CImp implements C {
    public void f() {}
  }

  private class CImp2 implements C {
    public void f(){}
  }

  public interface D {
    void f();
  }

  class DImp implements D {
    public void f() {}
  }

  private class DImp2 implements D {
    public void f(){}
  }

  public D getD() {return new DImp2();}
  private D dRef;
  public void received(D d){
    dRef = d;
    dRef.f();
  }
}

interface E {
  interface G {
    void f();
  }

  public interface H {
    void f();
  }

  void g();
}
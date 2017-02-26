package thinkinjava.demo.twelve;

/**
 * Created by linrufeng on 16/6/15.
 */
public class InheritingExceptions {

  public void f() throws SimpleException {
    System.out.println("Throw SimpleException form f()");
    throw new SimpleException();
  }

  public static void main(String[] args) {
    InheritingExceptions sed = new InheritingExceptions();
    try{
      sed.f();
    } catch (SimpleException e) {
      System.out.println("Caught it!");
    }
  }
}

class SimpleException extends Exception{}
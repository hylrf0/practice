package thinkinjava.demo.twelve;

/**
 * Created by linrufeng on 16/6/21.
 */
public class FinallyWorks {
  static int count = 0;

  public static void main(String[] args) {
    while(true) {
      try {
        if(count ++ == 0) {
          throw new ThreeExcepetion();
        }
        System.out.println("No exception");
      } catch (ThreeExcepetion e) {
        System.out.println("ThreeException");
      } finally {
        System.out.println("In finally clause");
        if(count == 2) {
          break;
        }
      }
    }
  }
}

class ThreeExcepetion extends Exception {}

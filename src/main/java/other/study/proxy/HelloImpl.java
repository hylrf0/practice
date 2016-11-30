package other.study.proxy;

/**
 * Created by linrufeng on 16/8/12.
 */
public class HelloImpl implements Hello {

  public void say(String name) {
    System.out.println("Hello! " + name);
  }
}

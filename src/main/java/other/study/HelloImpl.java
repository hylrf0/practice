package other.study;

/**
 * Created by linrufeng on 16/8/12.
 */
public class HelloImpl implements Hello {

  @Override
  public void say(String name) {
    System.out.println("Hello! " + name);
  }
}

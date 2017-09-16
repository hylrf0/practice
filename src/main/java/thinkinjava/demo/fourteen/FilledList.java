package thinkinjava.demo.fourteen;

/**
 * Created by linrufeng on 16/7/19.
 */
public class FilledList<T> {

}

class CountedInteger {
  private static long counter;
  private final long id = counter++;
  public String toString() {return Long.toString(id);}
}

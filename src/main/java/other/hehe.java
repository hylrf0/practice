package other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linrufeng on 16/7/1.
 */
public class Hehe {

  public static void main(String[] args) {
    List<String> list  = new ArrayList<String>();

    List<String> list1 = new ArrayList<String>();
    list.add("1234");
    list.add("5678");

    while (!list.isEmpty()) {
      list1.addAll(list);
      list.addAll(list1);
      System.out.println(list1.size());
    }
  }
}

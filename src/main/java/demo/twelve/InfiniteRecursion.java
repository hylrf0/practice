package demo.twelve;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linrufeng on 16/6/22.
 */
public class InfiniteRecursion {

  public String toString() {
//    return " InfiniteRecursion address: " + this + "\n";
    return " InfiniteRecursion address: " + super.toString() + "\n";
  }

  public static void main(String[] args) {
    List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
    for(int i=0; i<10; i++) {
      v.add(new InfiniteRecursion());
    }
    System.out.println(v);
  }
}

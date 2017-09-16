package thinkinjava.demo.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by linrufeng on 16/6/6.
 */
public class AddingGroups {

  public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(collection.toString());
    System.out.println("-------------------------------------");


    Integer[] moreInts = {6, 7, 8, 9, 10};
    collection.addAll(Arrays.asList(moreInts));
    System.out.println(collection.toString());
    System.out.println("-------------------------------------");

    Collections.addAll(collection, 11, 12, 13, 14, 15);
    System.out.println(collection.toString());
    System.out.println("-------------------------------------");


    Collections.addAll(collection, moreInts);
    System.out.println(collection.toString());
    System.out.println("-------------------------------------");


    List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
    System.out.println(list.toString());
    System.out.println("-------------------------------------");


    list.set(1, 99);
    System.out.println(list.toString());
  }
}

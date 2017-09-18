package thinkinjava.demo.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by linrufeng on 16/6/14.
 * P245
 * Arrays.asList会修改被引用的对象
 */
public class ModifyingArraysAsList {

  public static void main(String[] args) {
    Random random = new Random(47);
    Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
    System.out.println("Before shuffling:" + list1);
    Collections.shuffle(list1,random);
    System.out.println("After suffling:" + list1);
    System.out.println("array:" + Arrays.toString(ia));

    List<Integer> list2 = Arrays.asList(ia);
    System.out.println("Before shuffling:" + list2);
    Collections.shuffle(list2,random);
    System.out.println("After suffling:" + list2);
    System.out.println("array:" + Arrays.toString(ia));
  }
}

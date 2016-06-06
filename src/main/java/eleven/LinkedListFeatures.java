package eleven;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by linrufeng on 16/6/6.
 */
public class LinkedListFeatures {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(list);
    System.out.println("list.getFirst():" + list.getFirst());
    System.out.println("list.element():" + list.element());
    System.out.println("list.peek():" + list.peek());
    System.out.println("list.remove():" + list.remove());
    System.out.println("list.removeFirst():" + list.removeFirst());
    System.out.println("list.poll():" + list.poll());
    System.out.println(list);
    list.addFirst(0);
    System.out.println("After addFirst():" + list);
    list.offer(10);
    System.out.println("After offer():" + list);
    list.add(11);
    System.out.println("After add():" + list);
    list.addLast(12);
    System.out.println("After addLast():" + list);
    System.out.println("list.removeLast():" + list.removeLast());
  }

}

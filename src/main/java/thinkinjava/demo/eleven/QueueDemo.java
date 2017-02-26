package thinkinjava.demo.eleven;

import java.util.Queue;

/**
 * Created by linrufeng on 16/6/7.
 */
public class QueueDemo {

  public static void printQ(Queue queue){
    while(queue.peek() != null){
      System.out.print(queue.remove() + " ");
    }
    System.out.println();
  }
}

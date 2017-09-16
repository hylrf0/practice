package thinkinjava.demo.eleven;

import demo.eleven.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * Created by linrufeng on 16/6/7.
 */
public class PriorityQueueDemo {

  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue();
    Random rand = new Random(47);
    for(int i=0; i<10; i++){
      priorityQueue.offer(rand.nextInt(i + 10));
    }
    demo.eleven.QueueDemo.printQ(priorityQueue);

    List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
    priorityQueue = new PriorityQueue<Integer>(ints);
    demo.eleven.QueueDemo.printQ(priorityQueue);

    priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
    priorityQueue.addAll(ints);
    demo.eleven.QueueDemo.printQ(priorityQueue);

    String fact = "E D U C A T I O N S H O U L D E S C H E W O B F U S C A T I O N";
    List<String> strings = Arrays.asList(fact.split(" "));
    PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
    demo.eleven.QueueDemo.printQ(stringPQ);

    stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
    stringPQ.addAll(strings);
    demo.eleven.QueueDemo.printQ(stringPQ);

    Set<Character> charSet = new HashSet<Character>();
    for(char c : fact.toCharArray()){
      charSet.add(c);
    }
    PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
    demo.eleven.QueueDemo.printQ(characterPQ);
  }
}

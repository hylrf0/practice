package demo.eleven;

import java.util.LinkedList;

/**
 * Created by linrufeng on 16/6/6.
 */
public class Stack<T> {
  private LinkedList storage =new LinkedList();
  public void push(T v) {storage.addFirst(v);}
  public Object peek() {return storage.getFirst();}
  public Object pop() {return storage.removeFirst();}
  public boolean empty() {return storage.isEmpty();}
  public String toString() {return storage.toString();}
}

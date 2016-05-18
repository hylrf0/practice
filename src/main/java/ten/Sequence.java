package ten;


/**
 * Created by linrufeng on 16/5/16.
 * 内部类能访问其外围对象的所有成员,而不需要任何特殊条件.此外,内部类还拥有其外围类的所有元素的访问权.
 */
public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size){ items = new Object[size];}
  public void add(Object x) {
    if(next < items.length) {
      items[next++] = x;
    }
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end(){return i == items.length;}
    public Object current() {return items[i];}
    public void next(){ if(i < items.length) i++;}

  }

  public Selector selector(){
    return new SequenceSelector();
  }

  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i=0; i<10; i++) {
      sequence.add(Integer.toString(i));
    }
    Selector selector = sequence.selector();
    while (!selector.end()) {
      System.out.print(selector.current() + "  ");
      selector.next();
    }
  }
}

interface Selector {
  boolean end();
  Object current();
  void next();
}

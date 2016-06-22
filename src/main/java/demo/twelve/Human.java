package demo.twelve;

/**
 * Created by linrufeng on 16/6/22.
 * P275
 * catch(Exception e)可以捕获Exception及其所有从它派生的异常
 */
public class Human {

  public static void main(String[] args) {
    try {
      throw new Sneeze();
    }catch (Sneeze e) {
      System.out.println("Caught Sneeze");
    }catch (Annoyance e) {
      System.out.println("Caught Annoyance");
    }

    try {
      throw new Sneeze();
    }catch (Annoyance e) {
      System.out.println("Caught Annoyance");
    }
  }
}


class Annoyance extends Exception {}

class Sneeze extends Annoyance {}

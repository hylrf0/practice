package thinkinjava.demo.fourteen;

import java.util.Random;

/**
 * Created by linrufeng on 16/7/19.
 * P320
 */
public class ClassInitialization {
  public static Random rand = new Random(47);

  public static void main(String[] args) {
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");
    System.out.println(Initable.staticFinal);
    System.out.println(Initable.staticFinal2);
    System.out.println(Initable2.staticFinal);
    try {
      Class initable3 = Class.forName("demo.fourteen.Initable2");
    } catch (ClassNotFoundException e) {
      System.out.println("Couldn't find Initable3");
    }
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticFinal);
  }
}

class Initable {
  static final int staticFinal = 47;
  static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
  static {
    System.out.println("Initializing Initable");
  }
}

class Initable2 {
  static  int staticFinal = 147;
  static {
    System.out.println("Initializing Initable2");
  }
}

class Initable3 {
  static final int staticFinal = 74;
  static {
    System.out.println("Initializing Initable3");
  }
}
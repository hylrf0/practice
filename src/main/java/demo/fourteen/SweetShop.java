package demo.fourteen;

/**
 * Created by linrufeng on 16/7/19.
 * 一旦某个类的Class对象被载入内存,它就被用来创建这个类的所有对象。P315
 */
public class SweetShop {

  public static void main(String[] args) {
    System.out.println("inside main");
    new Candy();
    System.out.println("After creating Candy");
    try {
      Class.forName("demo.fourteen.Gum");
    } catch (ClassNotFoundException e) {
      System.out.println("Couldn't find Gum");
    }
    System.out.println("After Class.forname(\"Gum\")");
    new Cookie();
    System.out.println("After creating Cookie");
  }
}

class Candy {
  static {
    System.out.println("Loading Candy");
  }
}

class Gum {
  static {
    System.out.println("Loading Gum");
  }
}

class Cookie {
  static {
    System.out.println("Loading Cookie");
  }
}

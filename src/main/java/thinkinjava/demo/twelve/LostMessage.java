package thinkinjava.demo.twelve;

/**
 * Created by linrufeng on 16/6/21.
 * 异常丢失
 * P268
 */
public class LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }

  void dispose() throws HoHumException {
    throw new HoHumException();
  }

  public static void main(String[] args) {
    try {
      LostMessage lm = new LostMessage();
      try {
        lm.f();
      } finally {
        lm.dispose();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class VeryImportantException extends Exception {
  public String toString() {
    return "A very important exception";
  }
}

class HoHumException extends Exception {
  public String toString() {
    return "A trivial exception";
  }
}

package thinkinjava.demo.ten;

/**
 * Created by linrufeng on 16/5/19.
 */
public class Parcel8 {
  public Wrapping wrapping(int x){
    return new Wrapping(x) {
      public int value() {
        return super.value() * 47;
      }
    };
  }

  public static void main(String[] args) {
    Parcel8 p = new Parcel8();
    Wrapping w = p.wrapping(10);
    System.out.println(w.value());

    Wrapping ww = new Wrapping(10){
      public int value() {
        return 47;
      }
    };
    System.out.println(ww.value());
  }
}





class Wrapping {
  private int i;
  public Wrapping(int x){i = x;}
  public int value(){return i;}
}

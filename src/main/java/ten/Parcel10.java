package ten;

/**
 * Created by linrufeng on 16/5/19.
 * 对于匿名类而言,实例初始化的实际效果就是构造器.当然它不能重载,所以仅有一个构造器
 */
public class Parcel10 {
  public Destination destination(final String dest, final float price) {
    return new Destination() {
      private int cost;

      {
        cost = Math.round(price);
        if(cost > 100) {
          System.out.println("Over budget!");
        }
      }
      private String label = dest;
      @Override
      public String readLabel() {
        return label;
      }
    };
  }

  public static void main(String[] args) {
    Parcel10 p = new Parcel10();
    Destination d = p.destination("Tasmania", 101.395F);
  }
}

interface Destination {
  String readLabel();
}
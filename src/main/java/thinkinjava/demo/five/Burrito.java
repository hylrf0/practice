package thinkinjava.demo.five;

/**
 * Created by linrufeng on 2017/2/28.
 * enum可以在switch语句内使用
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) { this.degree = degree;}

    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.HOT);
        plain.describe();
        Burrito greenChile = new Burrito(Spiciness.MEDIUM);
        greenChile.describe();
    }
}

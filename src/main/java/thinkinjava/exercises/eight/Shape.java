package thinkinjava.exercises.eight;

/**
 * Created by linrufeng on 2017/3/13.
 */
public class Shape {
    public void draw() {}
    public void erase() {}
    public void printMessage() {
        System.out.println("print message");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        NewCircle newCircle = new NewCircle();
        circle.printMessage();
        newCircle.printMessage();
        System.out.println("------------------------");

    }
}

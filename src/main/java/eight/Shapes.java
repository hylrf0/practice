package eight;

import java.util.Random;

/**
 * Created by linrufeng on 16/4/28.
 * Java中出了static方法和final方法之外,其他所有的方法都是后期绑定.
 *
 */
public class Shapes {
    public void draw() {};
    public void erase() {};

    public static void main(String[] args) {
        RandomShapeGenerator gen = new RandomShapeGenerator();
        Shapes[] s =new Shapes[9];
        for(int i=0 ; i<s.length ; i++){
            s[i] = gen.next();
        }
        for(Shapes shp :s){
            shp.draw();
        }
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shapes next() {
        switch(rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

}

class Circle extends Shapes {
    public void draw() {
        System.out.println("Circle.draw()");
    }
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shapes {
    public void draw() {
        System.out.println("Square.draw()");
    }
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shapes {
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
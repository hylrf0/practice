package thinkinjava.demo.eight;

/**
 * Created by linrufeng on 16/5/3.
 * 1)在其他任何事物发生之前,将分配给对象的存储空间初始化成二进制的零.
 * 2)如前所述那样调用基类构造器.此时,调用被覆盖后的draw()方法(要在调用RoundGlyph构造器之前调用),由于步骤1的缘故,我们此时会发现radiuns的值为0.
 * 3)按照声明的顺序调用成员的初始化方法.
 * 4)调用导出类的构造器主体.
 */
public class PolyConstrctors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

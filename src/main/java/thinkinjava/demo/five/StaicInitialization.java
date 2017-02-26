package thinkinjava.demo.five;

/**
 * Created by linrufeng on 16/4/28.
 * 在创建一个新对象时,首先按顺序创建static对象,然后在new一个对象之前调用内部代码块的代码,再调用构造函数.
 */
public class StaicInitialization {
    static{
        System.out.println("static----1");
    }
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    static{
        System.out.println("static----2");
    }
}

class Bowl {
    Bowl(int marker){
        System.out.println("Bowl(" + marker + ")");
    }
    void f1 (int marker){
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    {
        System.out.println("not static");
    }
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(2);
    }
    void f2(int marker){
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3 (int marker) {
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

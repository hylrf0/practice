package demo.eight;

/**
 * Created by linrufeng on 16/5/3.
 * 基类的第一个方法调用第二个方法,导出类中覆盖了第二个方法.
 * 导出类向上转型并调用第一个方法时,最终的结果是调用导出类覆盖的方法
 */
public class Rodent {
    void doSomething(){
        eat();
    }

    void eat(){
        System.out.println("Rodent eat");
    }

    public static void main(String[] args) {
        Rodent mouse = new Mouse();
        mouse.doSomething();
    }
}

class Mouse extends Rodent {
    void eat(){
        System.out.println("Mouse eat");
    }
}

package demo.eight;

/**
 * Created by linrufeng on 16/5/3.
 * 复杂对象调用构造器要遵循:
 * 1) 递归调用基类构造器
 * 2) 按声明顺序调用成员的初始化方法
 * 3) 调用导出类构造器的主体
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
        System.out.println("--------");
        new Sandwich();
    }
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}

package thinkinjava.exercises.six;

/**
 * Created by linrufeng on 2017/3/8.
 */
public class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public static void main(String[] args) {
        Stem stem = new Stem();
    }

}

class Root{
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
    Root(){
        System.out.println("Root constructor");
    }
}

class Component1 {

    Component1(){
        System.out.println("Component1 constructor");
    }
}
class Component2 {

    Component2(){
        System.out.println("Component2 constructor");
    }
}
class Component3 {

    Component3(){
        System.out.println("Component3 constructor");
    }
}

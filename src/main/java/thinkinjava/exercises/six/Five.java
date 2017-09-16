package thinkinjava.exercises.six;

/**
 * Created by linrufeng on 2017/3/8.
 * 这是一个最简单的demo，但是这个demo涉及到类加载顺序的问题。
 加载流程是这样的：
 （1）入口方法是C类的main方法，运行之前需要把C类加载进内存，加载的时候发现C类继承自父类A所以要先把A类加载进内存。所以第一步是初始化A类的类变量和静态块。
 （2）初始化C类的类变量和静态块。
 （3）执行main函数
 （4）第一行是创建一个C的实例，先初始化A的实例变量
 （5）调用A的构造函数
 （6）初始化C的实例变量
 （7）调用C的构造函数
 */
public class Five extends C{
    D d = new D();

    public static void main(String[] args) {
        Five five = new Five();
    }
}

class C{
    C(){
        System.out.println("C constructor");
    }
}

class D{
    D(){
        System.out.println("D constructor");
    }
}
package other.test;

/**
 * Created by Administrator on 2017/3/17 0017.
 */
public class QuoteTest {

    public void test() {
        QuoteTest quoteTest = new QuoteTest();
        Demo demo = null;
//        demo = QuoteTest.getDemo();
        quoteTest.putValue(demo);
        System.out.println(demo);
    }

    public static Demo getDemo() {
        return new Demo();
    }

    private void putValue(Demo demo) {
        demo = QuoteTest.getDemo();
    }

    public static void main(String[] args) {
        QuoteTest quoteTest = new QuoteTest();
        quoteTest.test();
    }
}

class Demo{

    private Integer integer;

    private int i;

    private InnerDemo innerDemo;
}

class InnerDemo {

}
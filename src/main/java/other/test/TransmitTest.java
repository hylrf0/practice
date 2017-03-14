package other.test;

import lombok.Data;

/**
 * Created by Administrator on 2017/3/14 0014.
 * 研究java中值传递和引用传递的类
 */
public class TransmitTest {

    public void getTransmitTestA(TransmitTestA transmitTestA) {
        transmitTestA = new TransmitTestA();
    }

    public void chageTransmitTestA(TransmitTestA transmitTestA) {
        transmitTestA.setI(10);
        transmitTestA.setIn(10);
        transmitTestA.transmitTestB = new TransmitTestB();
    }

    public void changeValue(int k) {
        k = k * 2;
    }

    public static void main(String[] args) {
        //调用方法后a的值任然为null
        TransmitTestA a = null;
        TransmitTest transmitTest = new TransmitTest();
        transmitTest.getTransmitTestA(a);
        System.out.println(a);
        System.out.println("-----------------------------------------");

        //创建一个新对象后再次调用方法,并没有改变a的地址
        a = new TransmitTestA();
        System.out.println(a);
        transmitTest.getTransmitTestA(a);
        System.out.println(a);
        System.out.println("-----------------------------------------");

        //改变了内部属性的值
        System.out.println(a.getI());
        System.out.println(a.getIn());
        System.out.println(a.getTransmitTestB());
        transmitTest.chageTransmitTestA(a);
        System.out.println(a.getI());
        System.out.println(a.getIn());
        System.out.println(a.getTransmitTestB());
        System.out.println("-----------------------------------------");

        int k = 2;
        System.out.println(k);
        transmitTest.changeValue(k);
        System.out.println(k);
        System.out.println("-----------------------------------------");
    }
}

@Data
class TransmitTestA{

    private int i = 0;

    private Integer in = 0;

    public TransmitTestB transmitTestB;
}

class TransmitTestB {

}


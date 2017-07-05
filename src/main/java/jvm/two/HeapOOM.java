package jvm.two;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linrufeng on 2017/6/5.
 */
public class HeapOOM {

    static class OOMOBject {

    }

    public static void main(String[] args) {
        List<OOMOBject> list = new ArrayList<OOMOBject>();

        while (true) {
            list.add(new OOMOBject());
        }
    }
}

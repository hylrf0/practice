package jvm.four;

import org.apache.poi.sl.usermodel.Placeholder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by linrufeng on 2017/8/3.
 */
public class OOMObject {

    private byte[] placeholder = new byte[64 * 1024];

    public static void main(String[] args) {
        List<OMObject> list = new ArrayList<OMObject>();
        for (int i=0; i < 1000; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new OMObject());
            System.gc();
        }
    }

    static class OMObject{
        public byte[] placeholder = new byte[64 * 1024];
    }
}

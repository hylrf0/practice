package other.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class CollectionTest {

    public static void main(String[] args) {
        List list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(6);
        for(Object i : list) {
            System.out.println(i);
        }
        new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)).add(6);
    }
}

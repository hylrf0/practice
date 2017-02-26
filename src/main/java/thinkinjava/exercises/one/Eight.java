package thinkinjava.exercises.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by linrufeng on 2017/2/26.
 */
public class Eight {
    public static void main(String[] args) {
        List<StaticTest> staticTestList = new ArrayList<StaticTest>();
        for (int i=0; i<10; i++) {
            StaticTest staticTest = new StaticTest();
            staticTestList.add(staticTest);
        }

        Random random = new Random();
        staticTestList.get(random.nextInt(10)).i = 333;

        for (int i=0; i<10; i++) {
            System.out.println(staticTestList.get(i).i);
        }
    }
}

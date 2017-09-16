package demo.exercises.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2017/2/23 0023.
 */
public class Eight {
    public static void main(String[] args) {
        List<StaticTest> staticTests = new ArrayList<StaticTest>();
        for (int i=0; i<10; i++) {
            StaticTest staticTest = new StaticTest();
            staticTests.add(staticTest);
        }

        Random random = new Random();
        staticTests.get(random.nextInt(10)).i = 234;

        for (int i=0; i<10; i++) {
            System.out.println(staticTests.get(i).i);
        }
    }
}

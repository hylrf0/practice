package stream;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by linrufeng on 2017/10/29.
 */
public class CreateStream {

    public static void main(String[] args) {
        //可以用Collenction接口的sream方法将任何一个集合转换成流
        String[] words = {"asdf", "cvcxv", "refd", "fdfeg", "gwefew", "adsfadsf"};
        List<String> wordsList = Arrays.asList(words);

        Long count = wordsList.parallelStream().filter(word -> word.contains("asd")).count();

        System.out.println(count);

        //可以试用Stream.of方法将数组转换成流
        String[] strings = {"aaa", "bbb", "ccc"};
        count = Stream.of(strings).count();

        System.out.println(count);

        //Stream创建无限流
        Stream<String> echos = Stream.generate(() -> "Echo");

        Stream<Double> randoms = Stream.generate(Math::random);
        System.out.println(randoms.filter(random -> random > 0.4).count());

        Stream<BigInteger> bigIntegerStream = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));

        //limit
        Stream<Double> limit = Stream.generate(Math::random).limit(100L);

    }
}

package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by linrufeng on 2017/10/29.
 */
public class Main {

    public static void main(String[] args) {
        String[] words = {"asdf", "cvcxv", "refd", "fdfeg", "gwefew", "adsfadsf"};
        List<String> wordsList = Arrays.asList(words);

        Long count = wordsList.parallelStream().filter(word -> word.contains("asd")).count();

        System.out.println(count);
    }
}

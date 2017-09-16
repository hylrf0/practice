package thinkinjava.demo.nine;

import java.util.Arrays;

/**
 * Created by linrufeng on 16/5/4.
 * P174
 * 只要一个方法操作的是类而非接口,那么你就只能使用这个类及其子类
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}

class Upcase extends Processor {
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    String Process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

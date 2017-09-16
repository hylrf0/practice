package thinkinjava.exercises.eleven;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class Fifteen {

    public static void main(String[] args) {
        String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+_+r+u--+l+e+s---";

        Stack<String> stringStack = new Stack<String>();
        char[] chars = string.toCharArray();
        for (int i=0; i< chars.length; i++) {
            if (String.valueOf(chars[i]).equals("+")) {
                stringStack.push(String.valueOf(chars[++i]));
            } else {
                System.out.print(stringStack.pop());
            }
        }
    }
}

package thinkinjava.demo.five;

/**
 * Created by linrufeng on 2017/2/28.
 */
public class TerminationCondition {
}

class Book {
    boolean checkedOut = false;
    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}

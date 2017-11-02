package thread;

/**
 * Created by linrufeng on 2017/10/9.
 */
public class UnsynchBankTest {

    public static final int NACCOUNTS = 100;

    public static final double INITIAL_BALANCE = 1000;

    public static final double MAX_AMOUNT = 1000;

    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable runnable = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amonut = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amonut);
                        Thread.sleep((long) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}

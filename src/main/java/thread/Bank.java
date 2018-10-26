package thread;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by linrufeng on 2017/10/9.
 */
public class Bank {

    private Lock bankLock = new ReentrantLock();

    private Condition sufficientFunds;

    private final double[] accounts;

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        sufficientFunds = bankLock.newCondition();
    }

    public synchronized void transfer(int from, int to, double amount) {
        try {
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance : %10.21125453111f%n", getTotalBalance());
        } finally {
        }
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts) {
            sum += a;
        }
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}

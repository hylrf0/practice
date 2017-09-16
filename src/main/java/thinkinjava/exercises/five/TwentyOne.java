package thinkinjava.exercises.five;

/**
 * Created by linrufeng on 2017/2/28.
 * 21和22题
 */
public class TwentyOne {

    private Money money;

    public TwentyOne(Money money) {
        this.money = money;
    }

    public void description() {
        switch (money) {
            case ONE:
                System.out.println("1块钱");
                break;
            case FIVE:
                System.out.println("5块钱");
                break;
            case TEN:
                System.out.println("10块钱");
                break;
            case TWENTY:
                System.out.println("20块钱");
                break;
            case FIVTEEN:
                System.out.println("50块钱");
                break;
            case ONE_HUNDRED:
                System.out.println("100块钱");
                break;
            default:
                System.out.println("????");
        }
    }

    public static void main(String[] args) {
        for (Money money : Money.values()) {
            System.out.println(money + ", ordinal " + money.ordinal());
        }
        TwentyOne twentyOne = new TwentyOne(Money.FIVE);
        twentyOne.description();
    }
}

enum Money {
    ONE, FIVE, TEN, TWENTY, FIVTEEN, ONE_HUNDRED
}

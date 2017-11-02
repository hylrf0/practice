package interfaces;

/**
 * 充值服务
 * Created by linrufeng on 2017/10/13.
 */
public interface ChargeService {

    /**
     * 充值
     * @return
     */
    Boolean charge();

    /**
     * 押金充值
     * @return
     */
    Boolean depositCharge();

    /**
     * 购买骑行卡
     * @return
     */
    Boolean ridingCardCharge();
}

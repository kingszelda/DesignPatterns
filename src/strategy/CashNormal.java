package strategy;

/**
 * Created by shining.cui on 2016/4/13.
 * 没有活动策略
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}

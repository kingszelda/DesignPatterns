package strategy;

/**
 * Created by shining.cui on 2016/4/13.
 * 满立减活动策略
 */
public class CashReturn extends CashSuper {
    //满足多少返现
    private double moneyCondition = 0.0d;
//    返现返多少
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money/moneyCondition) * moneyReturn;
        }
        return result;
    }
}

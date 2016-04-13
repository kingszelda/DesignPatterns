package strategy;

/**
 * Created by shining.cui on 2016/4/13.
 * 打折方法抽象类，根据总价计算参加活动后的价格
 */
public abstract class CashSuper {
    public abstract double acceptCash(double money);
}

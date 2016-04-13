package strategy;

/**
 * Created by shining.cui on 2016/4/13.
 */
public class CashContext {
   CashSuper cashSuper;
//指定活动类型
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(Double money) {
        return cashSuper.acceptCash(money);
    }
}

package strategy;

/**
 * Created by shining.cui on 2016/4/13.
 * 设计商场结算程序，商场不定期更换活动信息，比如全场打8折、全场打6折、满300返100
 * 应当根据不同的打折策略变化，而不影响其他代码，因此使用策略模式，策略就是打折策略，其他代码不变
 */
public class Main {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext("满300减100");
        double result = cashContext.getResult(899.34d);
        System.out.println(result);
    }
}

package decorator;

/**
 * Created by shining.cui on 2016/4/13.
 * 装饰模式(Decorator)：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 * 题目描述：给一个人穿不同的衣服，形成不同的打扮
 */
public class Main {
    public static void main(String[] args) {
        Person xiaoCai = new Person("小菜");
        System.out.println("小菜的装扮");

        TShirts tShirts = new TShirts();
        FootballShoes footballShoes = new FootballShoes();
        BigTrouser bigTrouser = new BigTrouser();

        footballShoes.Decorate(xiaoCai);
        bigTrouser.Decorate(footballShoes);
        tShirts.Decorate(bigTrouser);

        tShirts.show();


    }

}

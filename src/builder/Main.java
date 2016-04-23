package builder;

/**
 * Created by shining.cui on 2016/4/23.
 * 建造者模式(Builder)，将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
        ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();

        director.construct(concreteBuilderA);
        Product p1 = concreteBuilderA.getResult();
        p1.show();

        director.construct(concreteBuilderB);
        Product p2 = concreteBuilderB.getResult();
        p2.show();
    }
}

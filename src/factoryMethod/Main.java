package factoryMethod;

/**
 * Created by shining.cui on 2016/4/22.
 * 工厂方法模式(Factory Method)：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * 与简单工厂的区别：简单工厂的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关类，对于客户端来说，去除了与具体
 * 产品的依赖。但是如果增加了新的判断条件，则必须修改工厂类，这就导致了对修改开放了，违背了开放-封闭原则。因此，将逻辑判断留给客户端做，
 * 这样就不会修改工厂类，符合开放-封闭原则。
 * 题目说明：不同的同学都要学雷锋做好事，同事也有志愿者学雷锋做好事。
 *
 * 工厂方法模式集中封装了对象的创建，使得要更换对象时，不需要做大的改动就可以实现。只需要新写需要加入的功能，降低了客户程序与产品对象的耦合。
 * 工厂方法模式是简单工厂模式的进一步抽象和推广。由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，而且克服了他的缺点。
 * 但缺点是由于每家一个产品就需要加一个产品的工厂类，增加了额外的开发量。如果是简单工厂模式，只需要在工厂类中修改一点逻辑即可。
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.Sweep();

        student.Wash();

    }
}
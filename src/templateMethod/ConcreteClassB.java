package templateMethod;

/**
 * Created by shining.cui on 2016/4/23.
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("B类方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("B类方法2实现");

    }
}

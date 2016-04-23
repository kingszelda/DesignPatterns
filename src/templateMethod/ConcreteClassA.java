package templateMethod;

/**
 * Created by shining.cui on 2016/4/23.
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("A类方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("A类方法2实现");

    }
}

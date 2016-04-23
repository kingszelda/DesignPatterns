package templateMethod;

/**
 * Created by shining.cui on 2016/4/23.
 */
public abstract class AbstractClass {
    //模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，他们都推迟到子类实现。
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    //一些抽象的行为放到子类中去

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();


}

package templateMethod;

/**
 * Created by shining.cui on 2016/4/23.
 * 模板方法模式，定义一个操作中的算法的骨架。而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可冲定义该算法的某些特定步骤。
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();
        c = new ConcreteClassB();
        c.templateMethod();
    }
}

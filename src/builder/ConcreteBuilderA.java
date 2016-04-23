package builder;

/**
 * Created by shining.cui on 2016/4/23.
 */
public class ConcreteBuilderA extends Builder {
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

package builder;

/**
 * Created by shining.cui on 2016/4/23.
 */
public class ConcreteBuilderB extends Builder {
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

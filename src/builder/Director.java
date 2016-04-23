package builder;

/**
 * Created by shining.cui on 2016/4/23.
 */
public class Director {
    public void construct(Builder builder) {
        builder.BuildPartA();
        builder.BuildPartB();
    }
}

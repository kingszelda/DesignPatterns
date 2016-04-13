package simpleFactory;

/**
 * Created by shining.cui on 2016/4/13.
 */
public class OperationDiv extends Operation {
    @Override
    public Double getResult() {
        return getFirstNumber() / getSecondNumber();
    }
}

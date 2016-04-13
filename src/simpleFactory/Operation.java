package simpleFactory;

/**
 * Created by Administrator on 2016/4/13.
 */
public abstract class Operation {
    private Double firstNumber;

    private Double secondNumber;

    public abstract Double getResult();

    public  Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }
}

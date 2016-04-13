package simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shining.cui on 2016/4/13.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        String[] split = line.split(" ");
        String firstNumberStr = split[0];
        String operate = split[1];
        String secondNumberStr = split[2];

        Operation operation = OperationFactory.creationOperate(operate);
        double firstNumber = Double.parseDouble(firstNumberStr);
        double secondNumber = Double.parseDouble(secondNumberStr);

        operation.setFirstNumber(firstNumber);
        operation.setSecondNumber(secondNumber);

        Double result = operation.getResult();

        System.out.println(result);
    }
}

package simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shining.cui on 2016/4/13.
 * 实现一个计算器，实现简答 1 + 1 = ?的问题
 * 为了实现良好的拓展性，这里使用简单工厂模式，可以进行如下抽象：
 * 操作数相同，因此是操作符不同会影响操作结果，所以可以将操作数定义为抽象类，不同的操作数继承之后实现不同的计算方法，
 * 通过调用不同的操作符，传入相应的操作数，就可以调用相应算法实现计算
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

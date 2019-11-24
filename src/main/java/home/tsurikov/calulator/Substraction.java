package home.tsurikov.calulator;

/**
 * Операция вичитания
 * @author Andrey
 */
public class Substraction implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left - right;
    }

}

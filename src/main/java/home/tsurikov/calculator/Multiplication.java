package home.tsurikov.calculator;

/**
 * Операция умножения
 * @author Andrey
 */
public class Multiplication implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left * right;
    }

}
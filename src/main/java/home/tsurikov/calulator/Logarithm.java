package home.tsurikov.calulator;

public class Logarithm implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.log(left) / Math.log(right);
    }
}

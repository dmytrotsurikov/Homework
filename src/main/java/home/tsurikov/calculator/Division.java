/*
деление
 */
package home.tsurikov.calculator;


public class Division implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return left / right;
    }
}

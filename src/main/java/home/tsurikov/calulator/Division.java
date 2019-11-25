/*
деление
 */
package home.tsurikov.calulator;


public class Division implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return left / right;
    }
}

package home.tsurikov.calculator;

public class Expression {

    public double leftOperand;
    public String operator;
    public double rightOperand;

    public Expression(double leftOperand, double rightOperand, String operator) {

        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;

    }


    public String getOperator() {
        return operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

}

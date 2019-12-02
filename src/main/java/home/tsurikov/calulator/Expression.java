package home.tsurikov.calulator;

import java.util.Scanner;

public class Expression {


    private String operator;
    private double leftOperand;
    private double rightOperand;



    public void expression(String input) {
        String Expression[] = input.split(" ");

        leftOperand = Double.parseDouble(Expression[0]);
        operator = Expression[1];
        rightOperand = Double.parseDouble(Expression[2]);

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

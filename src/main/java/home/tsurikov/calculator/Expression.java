package home.tsurikov.calculator;

import java.util.Scanner;

public class Expression {

    public double leftOperand;
    public String operator;
    public double rightOperand;

    public Expression(double leftOperand,double rightOperand,String operator) {

        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;

    }

    public String getInputData() {

        System.out.println("Введите выражение");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }


//      метод надо перенести в Parser, но он рабоатет
//        public void expression(String input) {
//        String parsExpression[] = input.split(" ");
//
//        leftOperand = Double.parseDouble(parsExpression[0]);
//        operator = parsExpression[1];
//        rightOperand = Double.parseDouble(parsExpression[2]);
//    }

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

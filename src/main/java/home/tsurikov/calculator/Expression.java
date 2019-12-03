package home.tsurikov.calculator;

import java.util.Scanner;

public class Expression {

    private double leftOperand;
    private String operator;
    private double rightOperand;

    public  String getInputData() {

        System.out.println("Введите выражение");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }

//    public void expression(String input) {
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

package home.tsurikov.calculator;

import java.util.Scanner;

public class Parser {


    public  String[] parser(String input) {

        Expression  expression = new Expression();

        String parsExpression[] = input.split(" ");

        expression.leftOperand = Double.parseDouble(parsExpression[0]);
        expression.rightOperand = Double.parseDouble(parsExpression[2]);
        expression.operator = parsExpression[1];

        return parsExpression;
    }

//    public  String[] parser(String input) {
//        double leftOperand;
//        String operator;
//        double rightOperand;
//
//        String parsExpression[] = input.split(" ");
//
//        leftOperand = Double.parseDouble(parsExpression[0]);
//        operator = parsExpression[1];
//        rightOperand = Double.parseDouble(parsExpression[2]);
//        return parsExpression;
//
//    }
}



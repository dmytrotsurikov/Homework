package home.tsurikov.calculator;

import java.util.Scanner;

public class Parser {


    public  String[] parser(String input) {

         double leftOperand;
         String operator;
         double rightOperand;

        String parsExpression[] = input.split(" ");

        leftOperand = Double.parseDouble(parsExpression[0]);
        operator = parsExpression[1];
        rightOperand = Double.parseDouble(parsExpression[2]);

        return parsExpression;

    }
}



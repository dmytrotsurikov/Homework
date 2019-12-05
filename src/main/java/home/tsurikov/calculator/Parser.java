package home.tsurikov.calculator;

public class Parser {


    public Expression parser(String input) {


        String parsExpression[] = input.split(" ");

        return new Expression(Double.parseDouble(parsExpression[0]),
                              Double.parseDouble(parsExpression[2]),
                              parsExpression[1]);
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



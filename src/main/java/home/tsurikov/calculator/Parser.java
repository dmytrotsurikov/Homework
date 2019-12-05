package home.tsurikov.calculator;

public class Parser {

    public Expression parser(String input) {

        String parsExpression[] = input.split(" ");

        return new Expression(Double.parseDouble(parsExpression[0]),
                              Double.parseDouble(parsExpression[2]),
                              parsExpression[1]);
    }
}



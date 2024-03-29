/*
На основе калькулятора net.wolf.javacourse.calculator создать собственную программу - калькулятор. Реализовать методы:
сложение 			(X + Y)
вычитание 			(X - Y)
умножение 			(X * Y)
деление 			(X  / Y)
возведение в степень 	(X  ^ Y)
логарифм по основанию 	(X log Y)
корень 			(X sqrt Y)
Команда должна создаваться в отдельном классе.
Пользователь вводит выражение X Operator Y, где X и Y - числа,  и получает ответ.
Парсинг выражения пользователя должен происходить также в отдельном классе.
Примичание:
1. логарифм по основанию можно преобразовать:
logB ( N ) = log (N) / log (B)
то есть, логарифм с основанием 2 от 256 = Math.log(256) / Math.log(2)
2. корень N-степени из числа A можно преобразовать в A в степени 1/N
Math.pow(A, 1.0/N)
 */

package home.tsurikov.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Parser parserExp = new Parser();

        String input = calculator.getInputData();
        Expression expr = parserExp.parser(input);

        System.out.println(calculator.calculate(expr.getLeftOperand(), expr.getRightOperand(), expr.getOperator()));

    }

    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        switch (operator) {
            case "*":
                return new Multiplication();
            case "+":
                return new Addition();
            case "-":
                return new Substraction();
            case "/":
                return new Division();
            case "^":
                return new Exponentiation();
            case "log":
                return new Logarithm();
            case "sqrt":
                return new Root();
            default:
                return null;
        }
    }

    public String getInputData() {

        System.out.println("Введите выражение");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
}

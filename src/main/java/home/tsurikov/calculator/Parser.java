package home.tsurikov.calculator;

import java.util.Scanner;

public class Parser {

    public static String getInputData() {

        System.out.println("Введите выражение");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }

    public static String[] parser(String input) {

        String expression[] = input.split("");
        return expression;

    }
}



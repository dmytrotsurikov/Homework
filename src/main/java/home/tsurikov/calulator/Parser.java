package home.tsurikov.calulator;

public class Parser {

    public static String[] parser() {

        Calculator calculator = new Calculator();
        String input = calculator.getInputData();
        String expression[] = input.split("");

        // for (int i = 0;i<input.length(); i++)
        //    System.out.println(input.charAt(i));


        return expression;

    }


    public static void main(String[] args) {
        parser();
    }
}

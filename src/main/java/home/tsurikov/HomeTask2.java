package home.tsurikov;

/*
Составить программу, которая будет раскладывать 5-ти значное число на отдельные цифры данного числа, слева-направо.
Число задается в параметре статического метода.
Каждую цифру вывести в отдельной строке.

 */
public class HomeTask2 {

    public static void main(String[] args) {
        int number = 45685;

        System.out.println(number);
        System.out.println(number / 10000);
        System.out.println(number / 1000 % 10);
        System.out.println(number / 100 % 10);
        System.out.println(number / 10 % 10);
        System.out.println(number / 1 % 10);
    }
}

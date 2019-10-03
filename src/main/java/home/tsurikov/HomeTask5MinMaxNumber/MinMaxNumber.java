/*
Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.
У числа 15875:
	Наименьшее число: 1
	Наибольшее число: 8
 */

package home.tsurikov.HomeTask5MinMaxNumber;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        long number = scanner.nextLong();

        long max, min;
        long num = number % 10;

        max=min=number % 10;

        while (number > 0) {
            long temp = number % 10;

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
            number /= 10;
        }
        System.out.println("Max: " + max + " Min:  " + min);

    }
}
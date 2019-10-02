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
        Long number = scanner.nextLong();

        int max = 0;
        int min = 0;
        int num = (int) (number % 10);

        while (num > 0) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            num /= 10;
        }
        System.out.println("Max: " + max + "Min: " + min);


    }
}

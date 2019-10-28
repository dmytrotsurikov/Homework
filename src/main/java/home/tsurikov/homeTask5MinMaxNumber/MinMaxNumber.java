/*
Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.
У числа 15875:
	Наименьшее число: 1
	Наибольшее число: 8
 */

package home.tsurikov.homeTask5MinMaxNumber;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        int[] ret= calculate(getNumber());
        System.out.printf("Max is %d  Min is %d  ", ret[0], ret[1]);

    }

    public static long getNumber () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        long number = scanner.nextLong();
        return number;

    }

    public static int[] calculate (long number){

        int max, min;
        int num = (int)(number % 10);

        max=min=(int)(number % 10);

        while (number > 0) {
            int temp =(int) (number % 10);

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
            number /= 10;
        }
        return new int[] {max, min};
    }
}
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

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number");
        Long number=scanner.nextLong();

       int max, min;
       int num= (int)(number%10);

        max = min = num;
        while(num>0){
            if(max < num) max = num;
            if(min > num) min = num;
            num=num/10;
        }

        System.out.println("max = "+ max + " min =" + min);



    }
}

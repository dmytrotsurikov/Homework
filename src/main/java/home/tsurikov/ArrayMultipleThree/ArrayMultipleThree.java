/* Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
 */

package home.tsurikov.ArrayMultipleThree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMultipleThree {


    public static void main(String[] args) {

        int[] array= randomArrayGenerator(getLengthOfArray ());
        System.out.println(Arrays.toString(array));

    }

    public static Integer getLengthOfArray (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число от 10 до 100");
        int lengthOfArrow=  scanner.nextInt();

        return lengthOfArrow;
    }

    private static int[] randomArrayGenerator(int lengthOfArrow){

        int[]array= new int [lengthOfArrow];
        Random random= new Random();
        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;

    }

}
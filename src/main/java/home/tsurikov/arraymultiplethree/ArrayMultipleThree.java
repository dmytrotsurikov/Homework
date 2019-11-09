/* Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
 */

package home.tsurikov.arraymultiplethree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayMultipleThree {


    public static void main(String[] args) {

        int[] array = randomArrayGenerator(getLengthOfArray());
        System.out.println(Arrays.toString(array));
        findMultipleThree(array);
    }

    public static Integer getLengthOfArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число от 10 до 100");
        int lengthOfArrow = scanner.nextInt();

        return lengthOfArrow;
    }

    public static int[] randomArrayGenerator(int lengthOfArrow) {

        int[] array = new int[lengthOfArrow];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        }
        return array;
    }

    public static void findMultipleThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.printf("%d ", array[i]);
            }
        }
    }
}
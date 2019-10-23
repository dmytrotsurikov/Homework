/* ДЗ 3 Задача 2.
        Пользователь вводит строку.
        Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.

        String[] words = “Sadfsdfs sdfsdf sdfsdf”.split(“ ”);
*/

package home.tsurikov.flipWords;

import java.util.Scanner;

public class FlipWords {

    public static void main(String[] args) {
        String sentence = getSentence();
        System.out.println(wordDivision(sentence));

    }

    public static String getSentence () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = scanner.nextLine();
        return sentence;

    }

    public static String  wordDivision(String sentence) {


        String[] words = sentence.split(" ");

        StringBuilder newSetence =new StringBuilder();
        for (int i=0; i < words.length; i++) {
            StringBuilder reverseWord = new StringBuilder(words[i]);
            reverseWord = reverseWord.reverse();
            if (i == (words.length - 1)) {
                newSetence.append(reverseWord);
            }
            else {
                newSetence.append(reverseWord).append(" ");
            }
        }
        return newSetence.toString();
    }

    }



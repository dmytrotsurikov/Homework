/* ДЗ 3 Задача 2.
        Пользователь вводит строку.
        Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.

        String[] words = “Sadfsdfs sdfsdf sdfsdf”.split(“ ”);
*/

package home.tsurikov.flipwords;

import java.util.Scanner;

public class FlipWords {

    public static void main(String[] args) {
        String sentence = getSentence();
        System.out.println(wordDivision(sentence));

    }

    public static String getSentence() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = scanner.nextLine();
        return sentence;

    }

    public static String wordDivision(String sentence) {

        String[] words = sentence.split("^[\\s]+$");  //разделить строку на cлова по пробелу

        StringBuilder newSetence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder reverseWords = new StringBuilder(words[i]).reverse();
      //      reverseWords = reverseWords.reverse();  // перворачиваем слова
      //      if (i == (words.length - 1)) {
      //          newSetence.append(reverseWords); //если элемент массива равен  добавляет слово
      //      } else {
      //          newSetence.append(reverseWords).append(" "); // в остальных случаях доабвяем пробел
      //      }
        }
        return newSetence.toString();  //возвращаем в виде строки
    }
}



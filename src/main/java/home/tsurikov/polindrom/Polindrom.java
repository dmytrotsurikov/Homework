/* Пользователь вводит последовательность символов.
        Программа должна определить, является ли последовательность палиндромом.
        Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.
*/

package home.tsurikov.polindrom;
// арозаупаланалапуазора
import java.util.Scanner;

public class Polindrom {

    private static final String POSITIVE_ANSWER="Your word is palindrom";
    private static final String NEGATIVE_ANSWER="No,Your word isn't palindrom";

    public static void main(String[] args) {

        String resultMessage = isPalindrome(getString ()) ? POSITIVE_ANSWER : NEGATIVE_ANSWER;
        System.out.println(resultMessage);

        }

    public static String getString () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        String string = scanner.nextLine();
        return string;
    }

     public static boolean isPalindrome(String string) {
        int n = string.length();

        for (int i = 0; i < (n/2); ++i) {
            char ch = string.charAt(i);
            char chlast = string.charAt(n-i-1);
            if (ch != chlast) {
                return false;
            }
        }
        return true;
    }
}

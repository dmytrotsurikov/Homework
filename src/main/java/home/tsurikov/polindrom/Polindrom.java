package home.tsurikov.polindrom;
// арозаупаланалапуазора
import java.util.Scanner;

public class Polindrom {

    public static void main(String[] args) {

        boolean da = isPalindrome(getString ()) ;
        System.out.println(da);

        }

    public static String getString () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String string = scanner.nextLine();
        return string;

    }

     public static boolean isPalindrome(String string) {
        int n = string.length();

        for (int i = 0; i < (n/2); ++i) {
            char ch= string.charAt(i);
            char chlast =string.charAt(n-i);
            if (ch != chlast) {
                return false;
            }
        }

        return true;
    }
}

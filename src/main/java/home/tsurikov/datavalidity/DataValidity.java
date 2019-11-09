/* Задача 4.
Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет данные на валидность с помощью регулярных выражений.
ФИО - только буквы английского  алфавита, дефис и пробел
Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .
Проверить все вводимые данные и вывести неверно введенные.
 */

package home.tsurikov.datavalidity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DataValidity {
    public static void main(String[] args) {

        String fullName = getfio();
        String mobile = getmobile();
        String email = getemail();
        checkFullName(fullName);
        checkMobile(mobile);
        checkEmail(email);
    }

    public static String getfio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше ФИО");

        String fullName = scanner.nextLine();
        return fullName;
    }

    public static String getmobile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите мобильный телефон в формате '+380 далее 2 цифры кода (Украина) и 7 любых цифр'");

        String mobile = scanner.nextLine();
        return mobile;
    }

    public static String getemail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш email");

        String email = scanner.nextLine();
        return email;
    }

    public static void checkFullName(String fullName) {

        Pattern pattern = Pattern.compile("^[A-Za-z\\s\\-]+$");

        if (pattern.matcher(fullName).matches()) {
            System.out.println("ФИО корректное");
            return;
        } else {
            System.out.println("ФИО '" + fullName + "' введено неправильно");
        }
    }

    public static void checkMobile(String mobile) {

        Pattern pattern = Pattern.compile("^\\+(380)(50|95|67|97)(\\d){7}$");

        if (pattern.matcher(mobile).matches()) {
            System.out.println("Mobile введен корретно");
            return;
        } else {
            System.out.println("Mobile '" + mobile + "' введен неправильно");
        }
    }

    public static void checkEmail(String email) {

        Pattern pattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");

        if (pattern.matcher(email).matches()) {
            System.out.println("Email введен корретно");
            return;
        } else {
            System.out.println("Email '" + email + "' введен неправильно");
        }
    }


}

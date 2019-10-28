/* Задача 4.
Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет данные на валидность с помощью регулярных выражений.
ФИО - только буквы английского  алфавита, дефис и пробел
Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .
Проверить все вводимые данные и вывести неверно введенные.
 */

package home.tsurikov.dataValidity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DataValidity {
    public static void main(String[] args) {

        String fullName = getdata();
        checkFullName(fullName);
    }

    public static String getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше ФИО");

        String fullName = scanner.nextLine();
        return fullName;
    }


    public static boolean paramsFullName(String fullName) {

        Pattern pattern = Pattern.compile("^[A-Za-z\\s\\-]+$");
        return pattern.matcher(fullName).matches();
    }

    public static void checkFullName(String fullName) {

        if (paramsFullName(fullName)) {
            System.out.println("ФИО корректное");
            return;
        } else {
            System.out.println("ФИО '" + fullName + "' введено неправильно");
        }
    }
}

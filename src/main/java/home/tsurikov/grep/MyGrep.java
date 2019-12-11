/*
Задача 7.1
Разработать программу, аналог grep :).
Программа ожидает 2 параметра на входе:
-имя файла (относительное либо полный путь)
-строку/регулярное выражение

После программа выводить все строки (с номером строки в файле), в которых найдена строка либо регулярное выражение.
Если файл не найден, либо доступ к нему запрещен, программа выводит соответствующее сообщение.

https://docs.oracle.com/javase/7/docs/api/java/io/LineNumberReader.html
https://javadevblog.com/kak-postrochno-schity-vat-fajl-v-java.html
 */
package home.tsurikov.grep;

import java.io.*;
import java.util.Scanner;
// C:\\Users\\Dmitriy\\Desktop\\test.txt
public class MyGrep {

    // построчное считывание файла
    public static void main(String[] args) {
        try {
            System.out.println("Введите путь к файлу");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();

            //создаем LineNumberReader с существующего FileReader для построчного считывания
           LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));

            System.out.println("Введите выражение");
            String expression = scanner.nextLine();

            String line;
            int lineNumber;

            while ((line = lineNumberReader.readLine()) != null) {
                if (line.contains(expression)) {
                    lineNumber = lineNumberReader.getLineNumber();
                    System.out.println(lineNumber + " " + line);
                 }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
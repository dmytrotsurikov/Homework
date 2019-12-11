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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyGrep {

    public static void main(String[] args) {
        try {
            System.out.println("Введите путь к файлу"); // C:\\Users\\Dmitriy\\Desktop\\test.txt  C:\Users\dtsurikov\Desktop\DC.txt
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();
            // построчное считывание файла
            //создаем LineNumberReader с существующего FileReader для построчного считывания
           LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));

            System.out.println("Введите выражение");
            String expression = scanner.nextLine();
            Pattern pattern = Pattern.compile(expression);

            String line;
            int lineNumber;
            boolean equal;

            while ((line = lineNumberReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                equal = matcher.find();
                if (equal) {
                    lineNumber = lineNumberReader.getLineNumber();
                    System.out.println(lineNumber + " " + line);
                 }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Выражение не найдено");
        }
    }
}
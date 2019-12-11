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

public class Grep {

    // построчное считывание файла
    public static void main(String[] args) {
        try {
            System.out.println("Введите путь к файлу");
            Scanner scanner=new Scanner(System.in);
            String input = scanner.nextLine();

           // File file = new File("C:\\Users\\Dmitriy\\Desktop\\test.txt");
            File file = new File(input);
            //создаем объект FileReader для объекта File

            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            System.out.println("Введите выражение");
            String input2 = scanner.nextLine();
            Pattern pattern = Pattern.compile(input2);

            String line ;
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
            //создаем BufferedReader с существующего FileReader для построчного считывания
//            BufferedReader reader = new BufferedReader(lineNumberReader);
//            // считаем сначала первую строку
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
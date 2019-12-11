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
https://metanit.com/java/tutorial/7.4.php
https://javarush.ru/groups/posts/regulyarnye-vyrazheniya-v-java

try with resources
https://javarush.ru/quests/lectures/questmultithreading.level01.lecture09
https://www.examclouds.com/java/java-core-russian/try-with-resources

 */
package home.tsurikov.grep;

import java.util.Scanner;

public class MyGrep {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу"); // C:\\Users\\Dmitriy\\Desktop\\test.txt  C:\Users\dtsurikov\Desktop\DC.txt
        String path = scanner.nextLine();
        System.out.println("Введите выражение");
        String regularExpression = scanner.nextLine();

        Expression expression = new Expression();
        expression.matching(path, regularExpression);

    }
}
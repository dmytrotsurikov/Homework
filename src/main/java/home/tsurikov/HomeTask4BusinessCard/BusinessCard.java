package home.tsurikov.HomeTask4BusinessCard;
/*
Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти  данные в следующем виде:

********************************
*        Курс: Java core       *
*            Студент           *
*              ФИО             *
********************************
Необходимо, чтобы программа сама определяла нужную длину рамки.
Сама же длина рамки зависит от длины наибольшей строки внутри рамки.
Используя циклы for легко можно выровнять стороны рамки.

"Строка".length()

 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class BusinessCard {

   public static final String COURSE = "Курс: Java core";
   public static final String STUDENT = "Студент";
   public static final int CONST = 4;


    public static String name () {
        Scanner scanner =  new Scanner(System.in);
        String fullname;

        System.out.println("Введите ФИО");
        fullname = scanner.nextLine();

        return fullname;
    }

    public static void compare(String fullname) {
        int maxLenght = COURSE.length();

        if (fullname.length() >= maxLenght) {
            maxLenght = fullname.length();
        }

                firstLine(maxLenght);
                secondLine(COURSE);
                thirdLine(STUDENT);

                firstLine(maxLenght);

        }


  public static void firstLine (int length) {

      for (int i = 0; i < length + CONST; i++) {
          System.out.printf("*");

      }
  }

    public static void secondLine (String COURSE ) {
        System.out.print(COURSE);
    }

    public static void thirdLine (String STUDENT ) {
        System.out.print(STUDENT);
    }




    public static void main(String[] args) {

        String fio = name();

        compare(fio);
    }
}

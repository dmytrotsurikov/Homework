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

 int len1 =COURSE.length();
       int len2 =STUDENT.length();


       for (int i=0; i< len2; i++) {
           System.out.print("*");

       }



        System.out.println("\n"+"*" +COURSE + "*");
        System.out.println();
        return len1;
    }

 */


import java.util.Scanner;

public class BusinessCard {

   public static final String COURSE = "Курс: Java core";
   public static final String STUDENT = "Студент";



    public static String name () {
        Scanner scanner =  new Scanner(System.in);
        String fullname;

        System.out.println("Введите ФИО");
        fullname = scanner.nextLine();

        return fullname;
    }

  public static int firstLine (String name) {
      int  fullname1 = name.length();


      return fullname1;

   }

    public static void main(String[] args) {

        String str = name();
        System.out.println(str);
        System.out.println(firstLine(str));
    }
}

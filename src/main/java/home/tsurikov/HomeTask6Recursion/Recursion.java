/*
Сначала единственным программистом в компании был ее основатель, а каждый следующий программист, которого нанимали на работу,
 проходил по одному собеседованию с каждым из программистов, которые уже работали в компании на тот момент.
Зная текущее количество программистов (вводится пользователем), определите, сколько всего собеседований было проведено в стенах компании.
Задачу решить с помощью рекурсии.
 */


package home.tsurikov.HomeTask6Recursion;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        // Sn =(A1+An)*n/2

        int total = calculation(getNumberOfEmployees());

       System.out.printf("Общее число собеседований: %d", total);
    }

    public static int getNumberOfEmployees() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите количество сотрудников:");
        int employees=scanner.nextInt();
        return employees;
    }

    public static int calculation(int employees) {
        final int  FIRSTINTERVIEW= 0;

        int empl=employees;
        int interview= empl-1;
        int totalInterview=(FIRSTINTERVIEW +interview)*empl/2;

        return totalInterview;
    }

}

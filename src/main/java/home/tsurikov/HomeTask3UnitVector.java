package home.tsurikov;
/*
Задание 3.
Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.

Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.

Длина вектора - Math.sqrt(X * X + Y * Y + Z * Z)

Пример:
Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)

 */
import java.util.Scanner;

public class HomeTask3UnitVector {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x");
        int x =scanner.nextInt();

        System.out.println("Введите координату y");
        int y =scanner.nextInt();

        System.out.println("Введите координату z");
        int z =scanner.nextInt();


        double modulevector = Math.sqrt(x * x + y * y +z * z);

        double unitvectorx = (x / modulevector);
        double unitvectory = (y / modulevector);
        double unitvectorz = (z / modulevector);


        System.out.printf("Единичный вектор для вектора (x:%d y:%d z:%d)",  x, y, z );
        System.out.printf(" => (%.2f %.2f %.2f)",  unitvectorx, unitvectory, unitvectorz );
    }
}

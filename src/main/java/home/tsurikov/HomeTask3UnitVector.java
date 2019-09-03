package home.tsurikov;

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


        double ModuleVector = Math.sqrt(x * x + y * y +z * z);

        double UnitVectorX = (x / ModuleVector);
        double UnitVectorY = (y / ModuleVector);
        double UnitVectorZ = (z / ModuleVector);


        System.out.printf("Единичный вектор для вектора (x:%d y:%d z:%d)",  x, y, z );
        System.out.printf(" => (%.2f %.2f %.2f)",  UnitVectorX, UnitVectorY, UnitVectorZ );
    }
}

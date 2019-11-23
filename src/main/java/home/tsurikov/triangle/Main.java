/*
Создать класс Point, который задает координаты в двумерном пространстве. Определить метод для расчета расстояния от текущей точки до указанной.
Point {
   float x;
   float y;
   float distance(Point pointTo)*;
}
*Для расчета дистанции нужно вычесть из одной точки другую и посчитать длину полученного вектора: (x1 - x2; y1 - y2) => sqrt(x’ ^ 2 + y’ ^ 2)

Создать класс Triangle, точки которого заданы классом Point. Определить методы для расчета периметра и площади треугольника.
А также метод классификации треугольника (равнобедренный, равносторонний, прямоугольный, произвольный).
Triangle {
   Point a;
   Point b;
   Point c;
   float perimeter();
   float square();
   String type();
}
Сгенерировать массив случайных треугольников. (100 000)
Найти первый попавшийся в массиве треугольник, заданного пользователем класса, вывести в консоль информацию о треугольнике, его периметр и площадь.
Если треугольник не найден, сообщить об этом пользователю.
Генерация 100000 треугольников…
Выберите класс треугольника для поиска:
1. Равнобедренный
2. Равносторонний
3. Прямоугольный
4. Произвольный

Найден равносторонний треугольник.
Индекс: 10
Треугольник[a(1;3) b(4;8) c(7;3)]
Периметр: 18
Площадь: 15
Дополнительно по желанию.
Подсчитать количество каждого из классов треугольников и вывести в консоль.

 */

package home.tsurikov.triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        int inputType = getInputData();

        Generator lastStep = new Generator();
        Triangle[] triangles = lastStep.generateTriangles();

        main.findTriangle(triangles, inputType);
    }

    // получае данные от пользователя
    public static int getInputData() {

        System.out.println("Пожалуйста укажите номер типа треугольника из списка:");
        System.out.println("1. Равнобедренный\n" + "2. Равносторонний\n" + "3. Прямоугольный\n" + "4. Произвольный");

        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();

        while (type <= 0 || type > 4) {
            System.out.println("Неверный тип треугольника. Укжитеномер еще раз: ");
            type = scanner.nextInt();
        }
        return type;
    }

    // находим треугольник из массива треугольников
    public void findTriangle(Triangle[] triangle, int typeNumber) {

        int count = 0;

        for (int i = 0; i < triangle.length; i++) {
            if (triangle[i].getType() == typeNumber) {
                printTriangleParams(triangle[i], i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("К сожалению, нет подходящего типа треугольникаtxtx");
        }
    }

    // вывод парметров треугольника из класса Triangle
    public void printTriangleParams(Triangle triangle, int index) {
        System.out.println("Индекс = " + index);
        System.out.println("Координаты = " + triangle.toString());
        System.out.println("Периметр = " + triangle.getPerimetr());
        System.out.println("Площадь = " + triangle.getSquare());
    }
}


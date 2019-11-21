package home.tsurikov.triangle;

import java.util.Random;

public class Generator {

    // рандом для координат
    private static Point generatePoint() {
        return new Point(new Random().nextInt(100), new Random().nextInt(100));
    }

    //массив треугольников
    public Triangle[] generateTriangles() {
        Triangle[] triangles = new Triangle[100000];

        int index = 0;
    // цикл проверки треугольников, где площадь !=0
        while (index < triangles.length) {
            Triangle triangle = new Triangle(generatePoint(), generatePoint(), generatePoint());
            if (triangle.getSquare() != 0) {
                triangles[index] = triangle;
                index++;
            }
        }
        return triangles;
    }
}

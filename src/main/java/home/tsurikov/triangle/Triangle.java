package home.tsurikov.triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;
    // private float perimetr;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //тестовый метод по проверке правильности расчеттов
    public static void main(String[] args) {
        Point a = new Point(0.0f, 0.0f);
        Point b = new Point(0.0f, 6.0f);
        Point c = new Point(6.0f, 0.0f);
        Triangle test1 = new Triangle(a, b, c);

        float perimetr = test1.getPerimetr();
        float square = test1.getSquare();
        boolean isoscelesTriangle = test1.isoscelesTriangle();
        boolean equilateralTriangle = test1.equilateralTriangle();
        boolean rectangularTriangle = test1.rectangularTriangle();
        boolean arbitraryTriangle = test1.arbitraryTriangle();

        System.out.println(perimetr);
        System.out.println(square);
        System.out.println(isoscelesTriangle);
        System.out.println(equilateralTriangle);
        System.out.println(rectangularTriangle);
        System.out.println(arbitraryTriangle);
    }

    //периметр треугольника (сумма длин его сторон)
    public float getPerimetr() {
        float perimetr = a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
        return perimetr;
    }

    //площадь треугольника (по формуле Герона)
    public float getSquare() {
        float halfRerimetr = getPerimetr() / 2;
        float square = (float)
                Math.sqrt(halfRerimetr * (halfRerimetr - a.getDistance(b)) * (halfRerimetr - b.getDistance(c)) * (halfRerimetr - c.getDistance(a)));
        return square;
    }

    //Равнобедренный треугольник.  Две стороны равны друг другу
    public boolean isoscelesTriangle() {
        float side1 = a.getDistance(b);
        float side2 = b.getDistance(c);
        float side3 = a.getDistance(c);

        return (side1 == side2 || side2 == side3 || side1 == side3);
    }

    //Равносторонний треугольник. Стороны  равны друг другу
    public boolean equilateralTriangle() {
        float side1 = a.getDistance(b);
        float side2 = b.getDistance(c);
        float side3 = a.getDistance(c);

        return (side1 == side2 && side2 == side3 && side1 == side3);
    }

    //Прямоугольный треугольник. (квадрат одной стороны треугольника равен сумме квадратов двух других сторон)
    public boolean rectangularTriangle() {
        float side1 = a.getDistance(b);
        float side2 = b.getDistance(c);
        float side3 = a.getDistance(c);

        return (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2) || Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2) || Math.pow
                (side3, 2) == Math.pow(side2, 2) + Math.pow(side1, 2));

        //  return true;
    }

    //Произвольный треугольник. Стороны не равны друг другу
    public boolean arbitraryTriangle() {
        float side1 = a.getDistance(b);
        float side2 = b.getDistance(c);
        float side3 = a.getDistance(c);

        if (side1 != side2 && side2 != side3 && side1 != side3) {
            return true;
        } else {
            return false;
        }
    }
}

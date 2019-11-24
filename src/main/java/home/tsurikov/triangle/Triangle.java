package home.tsurikov.triangle;

public class Triangle {

    private final static int ISOSCELES = 1;
    private final static int EQUILATERAL = 2;
    private final static int RECTANGULAR = 3;
    private final static int ARBITRARY = 4;

    private Point a;
    private Point b;
    private Point c;
    // private float perimetr;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // координаты (сохраняем как форматировання строка)
    public String toString() {

        float A = a.getX() + a.getY();
        float B = b.getX() + b.getY();
        float C = c.getX() + c.getY();

        return String.format("a:%s b:%s c:%s", A, B, C);
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

    }

    //Произвольный треугольник. Стороны не равны друг другу
    public boolean arbitraryTriangle() {
        float side1 = a.getDistance(b);
        float side2 = b.getDistance(c);
        float side3 = a.getDistance(c);

       return (side1 != side2 && side2 != side3 && side1 != side3);
    }

    public int getType() {
        if (isoscelesTriangle()) {
            return ISOSCELES;
        }
        if (equilateralTriangle()) {
            return EQUILATERAL;
        }
        if (rectangularTriangle()) {
            return RECTANGULAR;
        } else {
            return ARBITRARY;
        }
    }
}

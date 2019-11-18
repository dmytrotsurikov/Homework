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
        Point a = new Point(3.0f, 4.0f);
        Point b = new Point(5.0f, 7.0f);
        Point c = new Point(6.0f, 8.0f);
        Triangle test1 = new Triangle(a, b, c);

        float perimetr = test1.getPerimetr();
        float square = test1.getSquare();

        System.out.println(perimetr);
        System.out.println(square);
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

    public boolean isEquilateralTriangle() {
        float side1 = a.getDistance(b);
        float side2 = b.getDistance(c);
        float side3 = a.getDistance(c);

        return (side1 == side2 && side2 == side3 && side1 == side3);
    }


}

package home.tsurikov.triangle;

public class Point {

    private float x;
    private float y;

    // конструктор
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // расчет расстояния между точками.
    public float getDistance(Point point) {

        return (float) Math.hypot(point.x - x, point.y - y);
    }

}

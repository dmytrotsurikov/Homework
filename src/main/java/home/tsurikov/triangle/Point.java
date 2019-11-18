package home.tsurikov.triangle;

public class Point {

    private float x;
    private float y;

    // конструктор
    public Point(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    // расчет расстояния меду точками.
    public float getDistance(Point point){
       float distance =(float) Math.hypot(point.x-x, point.y-y);
       return distance;
    }

}

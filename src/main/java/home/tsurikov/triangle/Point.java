package home.tsurikov.triangle;

public class Point {

    private float x;
    private float y;

    // конструктор
    public Point(float x,float y) {
        this.x = x;
        this.y = y;
    }
    // расчет расстояния меду точками.
    public float getDictance(Point point){
       float distance =(float) Math.hypot(point.x-x, point.y-y);
       return distance;
    }

}

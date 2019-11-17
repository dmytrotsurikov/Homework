package home.tsurikov.triangle;

public class Point {
    public static void main(String[] args) {

        float qqq = getDictance();

        System.out.println(qqq);
    }
    private float x =5;
    private float y= 6;

    // конструктор
    public Point(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getDictance(Point pointTo){
       float distance =(float) Math.hypot(x-x, y-y);
       return distance;
    }

}

package home.tsurikov.triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //периметр треугольника
    public float getPerimetr(){
        float perimetr=a.getDictance(a) + b.getDictance(b) +c.getDictance(c);
        return perimetr;
    }

    public static void main(String[] args) {
        float perimetr = getPerimetr();
     //   https://javarush.ru/groups/posts/1393-oshibki-nachinajujshikh-java-programmistov-chastjh-2
     //   http://qaru.site/questions/166720/how-to-pass-method-result-as-parameter-to-base-class-constructor-in-c
     //   http://qaru.site/questions/266601/calculating-the-distance-between-two-points

    }

}

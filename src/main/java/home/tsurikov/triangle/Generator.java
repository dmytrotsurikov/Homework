package home.tsurikov.triangle;

import java.util.Random;

public class Generator {

    private static Point generatePoint() {
        return new Point (new Random().nextInt(100), new Random().nextInt(100));
    }

    public Triangle[] generateTriangles(){
        Triangle[] triangles = new Triangle[100000];

        Triangle triangles =  new Triangle(generatePoint(),generatePoint(),generatePoint());
                return triangles;

    }
}

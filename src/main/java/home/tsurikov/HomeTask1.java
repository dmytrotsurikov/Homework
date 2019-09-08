package home.tsurikov;

/*
Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
Каждое решение оформить в отдельном статическом методе.
x - (y + 123) / z * n  		=> считаем в long
(x + (50 - y * z) / n) - x 	=> считаем в int
x / (y * (z - 1) - 564) + n 	=> считаем в float
-x / -y + z / (n + 15) 		=> считаем в double


 */
public class HomeTask1 {
    static long equation1(){

        int x = 555252552;
        int y = 534534534;
        int z = 65353433;
        int n = 478738778;

        long example1 = x - (y + 123) / z * n;
        return example1;
    }

    static int equation2(){

        int x = 55;
        int y = 5345;
        int z = 653;
        int n = 478;

        int example2 = (x + (50 - y * z) / n) - x;
        return example2;
    }

    static float equation3(){

        int x = 555252552;
        int y = 534534;
        int z = 65353433;
        int n = 4788778;

        float example3 = x / (y * (z - 1) - 564) + n;
        return example3;
    }
    static double equation4(){

        int x = 555252552;
        int y = 534;
        int z = 65353433;
        int n = 478778;

        double example4 = -x / -y + z / (n + 15);
        return example4;
    }


    public static void main(String[] args) {
        System.out.println(equation1());
        System.out.println(equation2());
        System.out.println(equation3());
        System.out.println(equation4());
    }
}

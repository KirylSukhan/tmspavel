import java.sql.SQLOutput;
import static java.lang.Integer.sum;

public class Homework {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
       return Math.max(a,b);
    }

    public static double calculateHypotenuse(int a, int b) {
        double c = a*a+b*b;
        double d = Math.sqrt(c);
        return d;
    }

    public static void main(String[] args) {

        System.out.println(sum(4, 5));
        System.out.println(max(6, 6));
        System.out.println(calculateHypotenuse(12,16));

        // С Массивами ничего не делал, так как только начал про них читать
    }
}



public class Homework {

    public static int sum(int a, int b) {
        if ((a + b) > 2147483646) {
            return -1; // Не знаю почему, не возвращает -1;
        } else {
            return a + b;
        }
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double average(int[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        return average;
    }

    public static double calculateHypotenuse(int a, int b) {
        double c = a * a + b * b;
        double d = Math.sqrt(c);
        return d;
    }

    public static void main(String[] args) {

        System.out.println(sum(199, 199999));
        System.out.println(max(6, 6));
        System.out.println( double[] average = {9, 2, 5, 7}); // не знаю как проверить работает ли.
        System.out.println(calculateHypotenuse(12, 16));


        // С Массивами что-то поделал, но думаю, что не совсем правильно.
    }
}



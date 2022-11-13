public class Homework {

    public static int sum(int a, int b) {
        long result = (long) a + b;
        if (result > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double average(int[] array) {
        int result = 0;
        for (int value : array) {
            result += value;
        }
        return (double) result / array.length;
    }

    public static int max(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > result) {
                result = value;
            }
            return result;
        }
        return 0;
    }


    public static double calculateHypotenuse(int a, int b) {
        double c = a * a + b * b;
        return Math.sqrt(c);
    }

    public static void main(String[] args) {

        System.out.println(sum(199, 199999));
        System.out.println(max(6, 6));
        System.out.println(average(new int[]{9, 2, 5, 7}));
        System.out.println(max(new int[]{15, 25, 5, 7}));
        System.out.println(calculateHypotenuse(12, 16));


        // С Массивами что-то поделал, но думаю, что не совсем правильно.
    }
}



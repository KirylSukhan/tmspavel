import java.util.Scanner;

public class HomeWork1 {

    public static int moduli(int a1, int b1, int c1) {
        Scanner scanner = new Scanner(System.in);
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        c1 = scanner.nextInt();
        if (Math.abs(a1) <= Math.abs(b1) || Math.abs(a1) <= Math.abs(c1)) return a1;
        if (Math.abs(b1) <= Math.abs(c1) || Math.abs(b1) <= Math.abs(a1)) return b1;
        if (Math.abs(c1) <= Math.abs(b1) || Math.abs(c1) <= Math.abs(a1)) return c1;
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(moduli(-12, 15, 25));
    }
} // тут я уже запутался и перестал что-то понимать.


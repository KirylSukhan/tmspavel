import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {  //1.
            System.out.print(i + " ");
        }
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        if (number1 % 2 == 0) System.out.println("Число четное");
        if (number1 % 2 == 1) System.out.println("Число нечетное");

        int n = (int) (28800 * Math.random());
        System.out.println(n);
        if (n > 0 && n < 3599) System.out.println("остался 1 час");
        if (n > 3600 && n < 7199) System.out.println("осталось 2 часа");
        if (n > 7200 && n < 10799) System.out.println("осталось 3 часа");
        if (n > 10800 && n < 14399) System.out.println("осталось 4 часа");
        if (n > 14400 && n < 17999) System.out.println("осталось 5 часов");
        if (n > 18000 && n < 21599) System.out.println("осталось 6 часов");
        if (n > 21600 && n < 25199) System.out.println("осталось 7 часов");
        if (n > 25200 && n < 28800) System.out.println("осталось 8 часов");
    }

}

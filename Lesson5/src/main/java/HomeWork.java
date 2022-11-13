import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int x = (int) (1 + (7 * Math.random()));
        switch (x) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");
        }
        int ameba = 1;
        for (int i = 3; i <= 24; i = i + 3) {
            ameba *= 2;
            System.out.println("Количество амеб через " + i + " часа/часов:" + ameba);
        }

//
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        int b = 0;
        if (z < 0) {
            while (z < 0) {
                z /= 10;
                b++;
            }
            System.out.println("Число отрицательное");
            System.out.println("Количество цифр в числе: " + b);
        } else {
            while (z > 0) {
                z /= 10;
                b++;
            }
            System.out.println("Число положительное");
            System.out.println("Количество цифр в числе: " + b);
        }
        int den = scanner.nextInt();
        System.out.println("День: " + den);
        if (den <= 0 || den > 31) {
            System.out.println("Нет такого дня");
        }
        int mesyac = scanner.nextInt();
        if (mesyac < 0 || mesyac > 12) {
            System.out.println("Нет такого месяца");
        } else {
            System.out.println("Месяц: " + mesyac);
        }
        if ((den >= 22 && den <= 31 && mesyac == 12) || (den >= 1 && den <= 20 && mesyac == 1)) {
            System.out.println("Козерог");
        } else {
            if ((den >= 21 && den <= 31 && mesyac == 1) || (den >= 1 && den <= 19 && mesyac == 2)) {
                System.out.println("Водолей");
            } else {
                if ((den >= 20 && den <= 29 && mesyac == 2) || (den >= 1 && den <= 20 && mesyac == 3)) {
                    System.out.println("Рыбы");
                } else {
                    if ((den >= 21 && den <= 31 && mesyac == 3) || (den >= 1 && den <= 20 && mesyac == 4)) {
                        System.out.println("Овен");
                    } else {
                        if ((den >= 21 && den <= 30 && mesyac == 4) || (den >= 1 && den <= 21 && mesyac == 5)) {
                            System.out.println("Телец");
                        } else {
                            if ((den >= 22 && den <= 31 && mesyac == 5) || (den >= 1 && den <= 21 && mesyac == 6)) {
                                System.out.println("Близнецы");
                            } else {
                                if ((den >= 22 && den <= 30 && mesyac == 6) || (den >= 1 && den <= 22 && mesyac == 7)) {
                                    System.out.println("Рак");
                                } else {
                                    if ((den >= 23 && den <= 31 && mesyac == 7) || (den >= 1 && den <= 21 && mesyac == 8)) {
                                        System.out.println("Лев");
                                    } else {
                                        if ((den >= 22 && den <= 30 && mesyac == 8) || (den >= 1 && den <= 23 && mesyac == 9)) {
                                            System.out.println("Дева");
                                        } else {
                                            if ((den >= 24 && den <= 31 && mesyac == 9) || (den >= 1 && den <= 23 && mesyac == 10)) {
                                                System.out.println("Весы");
                                            } else {
                                                if ((den >= 24 && den <= 31 && mesyac == 10) || (den >= 1 && den <= 23 && mesyac == 11)) {
                                                    System.out.println("Скорпион");
                                                } else {
                                                    if ((den >= 24 && den <= 30 && mesyac == 11) || (den >= 1 && den <= 21 && mesyac == 12)) {
                                                        System.out.println("Стрелец");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задание 1");

        int clientOS = 1;// IOS-0, Android-1
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task2
        System.out.println("Задание 2");
        int clientOSis = 0;// IOS-0, Android-1
        int year = 2019; // год выпуска
        if (clientOSis == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSis == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSis == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    }
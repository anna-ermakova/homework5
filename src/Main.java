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
        int clientOSis = 1;// IOS-0, Android-1
        int clientDeviceYear = 2015; // год выпуска
        if (clientOSis == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientOSis == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOSis == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOSis == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");

        //task3
        System.out.println("Задание 3");

        int year = 2140;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }

        //task4
        System.out.println("Задание 4");

        int deliveryDistance = 120;
        int minDistance = 20;//km
        int deltaDistance = 40;//km шаг расстояния для увеличения срока доставки
        int minDeliveryInDays = 1;// минимум дней на доставку
        int deltaDeliveryInDays = 1;// дней. Шаг увеличения дней доставки
        if (deliveryDistance - minDistance > 0) {
            System.out.println("На доставку потребуется дней: " + (deliveryDistance / deltaDistance + deltaDeliveryInDays));
        } else {
            System.out.println("На доставку потребуется дней: " + minDeliveryInDays);
        }

        //task5
        System.out.println("Задание 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
                //task6
                System.out.println("Задание 6");

                int age = 19;
                double salary = 58_000;//руб.
                int minCoefficient1 = 2;//коэф. зарплаты для клиентов младше 23 лет
                int minCoefficient2 = 3;//коэф. зарплаты для клиентов от 23 лет и старше
                double minLimit = 1.2;//увеличение лимита в раз при зп>=50т.р.
                double maxLimit = 1.5;// увеличение лимита в раз при зп >=80 т.р.
                if (age < 23 && salary < 50_000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей.");}
                    if (age < 23 && salary >= 80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.5) + " рублей.");}
                    if (age < 23 && salary >= 50_000 && salary<80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.2) + " рублей.");}
                    if (age >= 23 && salary < 50_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей.");}
                    if (age >= 23 && salary >= 80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.5) + " рублей.");}
                    if (age >= 23 && salary >= 50_000 && salary<80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.2) + " рублей.");}



        }
    }
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
        if (deliveryDistance-minDistance>0){
            System.out.println("На доставку потребуется дней: "+ (deliveryDistance/deltaDistance+deltaDeliveryInDays));
        }else {
            System.out.println("На доставку потребуется дней: " + minDeliveryInDays);
        }

        //task5
        System.out.println("Задание 5");
        int monthNumber=66;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }



    }
}

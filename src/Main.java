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

                int ageClient = 19;
                double salaryClient = 58_000;//руб.
                int minCoefficient1 = 2;//коэф. зарплаты для клиентов младше 23 лет
                int minCoefficient2 = 3;//коэф. зарплаты для клиентов от 23 лет и старше
                double minLimit = 1.2;//увеличение лимита в раз при зп>=50т.р.
                double maxLimit = 1.5;// увеличение лимита в раз при зп >=80 т.р.
                if (ageClient < 23 && salaryClient < 50_000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salaryClient * 2) + " рублей.");}
                    if (ageClient < 23 && salaryClient >= 80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salaryClient * 2 * 1.5) + " рублей.");}
                    if (ageClient < 23 && salaryClient >= 50_000 && salaryClient<80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salaryClient * 2 * 1.2) + " рублей.");}
                    if (ageClient >= 23 && salaryClient < 50_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salaryClient * 3) + " рублей.");}
                    if (ageClient >= 23 && salaryClient >= 80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salaryClient * 3 * 1.5) + " рублей.");}
                    if (ageClient >= 23 && salaryClient >= 50_000 && salaryClient<80_000){
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salaryClient * 3 * 1.2) + " рублей.");}


        //task7
        System.out.println("Задание 7");
        int age=25;
        int salary =60_000;
        int wantedSum = 330_000;
        int period=12;// месяцев срок кредита
        int maxMonthlyPayment=salary/2;//ежемесячный платеж
        double creditRate1=10.0;// 10% годовых ставка для клиентов от 30лет и старше
        double creditRate2=11.0;// 11% годовых ставка для клиентов младше 23 лет
        double creditRate3=9.3;// 9,3% годовых ставка для клиентов с зп больше 80т.р.

        double creditPayment1=((wantedSum/creditRate1+wantedSum)/period);
        double creditPayment2=((wantedSum/creditRate2+wantedSum)/period);
        double creditPayment3=((wantedSum/creditRate3+wantedSum)/period);
        boolean monthlyPayment1=maxMonthlyPayment>creditPayment1;
        boolean monthlyPayment2=maxMonthlyPayment>creditPayment2;
        boolean monthlyPayment3=maxMonthlyPayment>creditPayment3;

        if ( salary>80_000 && monthlyPayment3) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + creditPayment3 + " рублей. Одобрено");
        } else if (monthlyPayment2 && age<30 && age>=23 && salary<=80_000) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + creditPayment2 + " рублей. Одобрено");
        } else if (monthlyPayment1 && age<23 && salary<=80) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + creditPayment1 + " рублей. Одобрено");
        }else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Отказано.");
        }
    }
    }









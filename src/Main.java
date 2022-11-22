public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        System.out.println("Задание 2");

        int clientDeviceYear = 2015;
        int clientDeviceYearCurrent = 2013;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYearCurrent < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYearCurrent < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }

        System.out.println("Задача 3");

        int year = 2022;
        int leapYear = 4;
        int noLeapYear = 100;
        int leapYear400 = 400;
        if (year % noLeapYear == 0 && year % leapYear400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % leapYear == 0 && year % noLeapYear != 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % noLeapYear == 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int timeOfDelivery = 1 + (deliveryDistance + 19) / 40;
        System.out.println("Потребуется дней для доставки: " + timeOfDelivery);

        System.out.println("Задание 5");
        int monthNumber = 5;
        switch (monthNumber){
            case 1:
                System.out.println("На улице зима.");
                break;
            case 2:
                System.out.println("На улице зима.");
                break;
            case 3:
                System.out.println("На улице весна.");
                break;
            case 4:
                System.out.println("На улице весна.");
                break;
            case 5:
                System.out.println("На улице весна.");
                break;
            case 6:
                System.out.println("На улице лето.");
                break;
            case 7:
                System.out.println("На улице лето.");
                break;
            case 8:
                System.out.println("На улице лето.");
                break;
            case 9:
                System.out.println("На улице осень.");
                break;
            case 10:
                System.out.println("На улице осень.");
                break;
            case 11:
                System.out.println("На улице осень.");
                break;
            case 12:
                System.out.println("На улице зима.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}
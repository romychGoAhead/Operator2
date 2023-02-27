public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }

    public static void task1() {
        System.out.println("Задача №1:");
        System.out.println("Вам, предлагается скачать приложение с учетом того, какая операционная система у пользователя. Если iOS нажми 0, если Android нажми 1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        System.out.println("Задача №2:");
        System.out.println("Вам, предлагается скачать приложение с учетом года выпуска телефона и операционной системой пользователя. Если iOS нажми clientOS - 0, если Android нажми clientOS - 1 и выбери год выпуска телефона.");

        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");

        }
    }

    public static void task3() {
        System.out.println("Задача №3:");
        System.out.println("Узнать какой год?");

        int year = 2000;

        if (year % 400 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else if (year % 100 == 0) {
            System.out.println("Год " + year + " не является високосным.");
        } else if ((year % 400 != 0) && (year % 100 != 0) && (year % 4 != 0)) {
            System.out.println("Год " + year + " не является високосным.");
        } else if ((year % 400 != 0) && (year % 100 != 0) && (year % 4 == 0)) {
            System.out.println("Год " + year + " является високосным.");

        }
    }

    public static void task4() {
        System.out.println("Задача №4:");
        System.out.println("Доставка карт на дом.");

        int deliveryDistance = 101;
        int deliveryPeriod1 = 1;
        int deliveryPeriod2 = 2;
        int deliveryPeriod3 = 3;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryPeriod1);

        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryPeriod2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliveryPeriod3);
        }
        else {System.out.println("доставки нет");
        }

    }

    public static void task5() {
        System.out.println("Задача №5:");

        int monthNumber = 6;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}












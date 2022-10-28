import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("задние 1 ");
        int years = 2003;                     task1(years);

        System.out.println("задние 2 ");
        int clientOS = 1;
        int clientDeviceYear  =2012;           task2 (clientOS , clientDeviceYear);

        System.out.println("задние 3 ");
        int deliwery= 40;                     task3(deliwery);
    }
    public static void task1(int years) {
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years +" високосный год ");
            return;
        }else {
            System.out.println(years +" не високосный год ");
            return;
        }
    }
    public static void task2(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите  приложения для Android по ссылке !");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке!");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите  приложения для iOS по ссылке !");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке !");
        }
    }
    static String  words= "Потребуется дней: ";
    public static void  task3(int deliwery) {

        int time =0;
        for (int i = -20; i < deliwery ; i+=40) {
            time++;
        }
        System.out.println(  words + time);
    }
}
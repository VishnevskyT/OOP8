package exercise_3;


/**
 Завдання 3
 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб висновок був наступним: Device:
 manufacturer = Samsung, price = 120, serialNumber=AB1234567CD, X=1280,Y=1024.
 */

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        System.out.print(monitor);
    }


}

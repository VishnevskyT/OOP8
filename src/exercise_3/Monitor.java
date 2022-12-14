package exercise_3;

/**
 Завдання 3
 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб висновок був наступним: Device:
 manufacturer = Samsung, price = 120, serialNumber=AB1234567CD, X=1280,Y=1024.
 */

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                "X = " + resolutionX + ",\n" +
                "Y = " + resolutionY + ".";
    }
}

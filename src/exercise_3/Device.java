package exercise_3;

/**
 Завдання 3
 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб висновок був наступним: Device:
 manufacturer = Samsung, price = 120, serialNumber=AB1234567CD, X=1280,Y=1024.
 */

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:\n" +
                "manufacturer = " + manufacturer + ",\n" +
                "price = " + price + ",\n" +
                "serialNumber = " + serialNumber + ",\n";
    }
}

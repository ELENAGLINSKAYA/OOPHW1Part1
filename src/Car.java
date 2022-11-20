public class Car {
    String brand;
    float engineVolume;
    String model;
    String color;
    int year;
    String country;

    Car (String brand, String model, float engineVolume,String color, String country, int year) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void go(){
        System.out.println(" Марка машины " + brand + " модель " + model + "объём двигателя " + engineVolume + " литров " + "цвет " + color + "год выпуска "+ year + " цвет " +country);
    }}


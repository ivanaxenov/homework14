public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public void showInfo() {
        System.out.println(brand + " " + model + ", " + year + " год выпуска, сборка в "
                + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.");
    }

}

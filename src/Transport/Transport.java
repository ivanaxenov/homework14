package Transport;


public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private String maxSpeed;
    private String fuelType;
    protected String defalt = "default";

    private float fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, String maxSpeed,
                     float fuelPercentage, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuelPercentage = fuelPercentage;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в "
                + getCountry() + ", " + getColor() + " цвет, максимальная скорость - " + getMaxSpeed()
                + "км/ч. Количество топлива в процентах — " + fuelPercentage + " л.";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = defalt;
        }
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        if (maxSpeed != null && !maxSpeed.isEmpty() && !maxSpeed.isBlank()) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = defalt;
        }
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    void setFuelPercentage(float fuelPercentage) {
        if (fuelPercentage < 0f && fuelPercentage > 100.00f) {
            this.fuelPercentage = 10;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public abstract void refil();
}

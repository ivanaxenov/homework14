package Transport;

public class Bus extends Transport {
    private String busType;


    public Bus(String brand, String model, int year, String country, String color, String maxSpeed, float fuelPercentage,
               String fuelType, String busType) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage, fuelType);
        this.busType = busType;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        if (busType != null && !busType.isEmpty() && !busType.isBlank()) {
            this.busType = busType;
        } else {
            this.busType = "Муниципальный";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "  Тип автобуса - " + busType + ".";
    }

    @Override
    public void refil() {
        System.out.println("Заправьте " + getFuelType() + " на заправке");
        setFuelPercentage(100f);
    }

}

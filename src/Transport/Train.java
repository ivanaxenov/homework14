package Transport;


public class Train extends Transport {

    private float tripPrice;
    private String tripTime;
    private String departureStation;
    private String arrivalStation;
    private int railwayCarriageCount;


    public Train(String brand, String model, int year, String country, String color, String maxSpeed,
                 float fuelPercentage, float tripPrice, String tripTime, String departureStation,
                 String arrivalStation, int railwayCarriageCount) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage, "дизель");
        this.tripPrice = tripPrice;
        this.tripTime = tripTime;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.railwayCarriageCount = railwayCarriageCount;
    }

    @Override
    public void refil() {
        System.out.println("Заправьте " + getFuelType());
        setFuelPercentage(100f);
    }

    @Override
    public String toString() {
        return super.toString() + " Cтоимость поездки — " + tripPrice + " рублей. Время в поездке - " + tripTime
                + ". Станция отправления - " + arrivalStation + ". Станция прибытия - " + departureStation
                + ". Количество вагонов - " + railwayCarriageCount + ".";
    }

    public float getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(float tripPrice) {
        if (tripPrice != 0) {
            this.tripPrice = tripPrice;
        } else {
            this.tripPrice = 1;
        }
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        if (tripTime != null && !tripTime.isBlank() && !tripTime.isEmpty()) {
            this.tripTime = tripTime;
        } else {
            this.tripTime = defalt;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null && !departureStation.isEmpty() && !departureStation.isBlank()) {
            this.departureStation = departureStation;
        } else {
            this.departureStation = defalt;
        }
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation != null && !arrivalStation.isBlank() && !arrivalStation.isEmpty()) {
            this.arrivalStation = arrivalStation;
        } else {
            this.arrivalStation = defalt;
        }
    }

    public int getRailwayCarriageCount() {
        return railwayCarriageCount;
    }

    public void setRailwayCarriageCount(int railwayCarriageCount) {
        if (railwayCarriageCount != 0) {
            this.railwayCarriageCount = railwayCarriageCount;
        } else {
            this.railwayCarriageCount = 10;
        }
    }
}

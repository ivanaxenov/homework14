package Transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    private float engineVolume;
    private String transmission;
    private String carBody;
    private String registrationNumber;
    private int seatCount;
    private String rubberType;

    public class Key {
        private String remoteEngineAccess;
        private String keylessAccess;

        public Key(String remoteEngineAccess, String keylessAccess) {
            if (remoteEngineAccess != null || !remoteEngineAccess.isEmpty() || !remoteEngineAccess.isBlank()) {
                this.remoteEngineAccess = remoteEngineAccess;
            } else {
                this.remoteEngineAccess = defalt;
            }

            if (keylessAccess != null || !keylessAccess.isBlank() || !keylessAccess.isEmpty()) {
                this.keylessAccess = keylessAccess;
            } else {
                this.keylessAccess = defalt;
            }
        }
    }

    public class Insurance {
        private String validity;
        private Double price;
        private String number;

        public Insurance(String validity, Double price, String number) {
            if (validity != null || !validity.isEmpty() || !validity.isBlank()) {
                this.validity = validity;
            } else {
                this.validity = defalt;
            }
            if (price > 0) {
                this.price = price;
            } else {
                this.price = 1_000_000d;
            }
            if (number != null || !number.isBlank() || !number.isEmpty()) {
                this.number = number;
            } else {
                this.number = "000000000";
            }
        }

        public String checkInsurenseNumber() {
            String str = "";
            if (number.length() != 9) {
                str = "Номер страховки некорректный!";
            }
            return str;
        }

        public String checkVadilityInsurence(Car car) {
            String str = "";
            int numb = Integer.parseInt(this.getValidity());
            numb = LocalDate.now().getYear() - numb;
            if (numb > 0) {
                str += "Срок страховки истек. Срочно съездите продлить страховку!";
            }
            return str;
        }

        public String getValidity() {
            return validity;
        }

        public Double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }
    }

    public Car(String brand, String model, float engineVolume, String color, int year, String country, String maxSpeed,
               float fuelPercentage, String fuelType, String transmission, String carBody, String registrationNumber, int seatCount,
               String rubberType) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage, fuelType);
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = defalt;
        } else {
            this.transmission = transmission;
        }
        if (carBody == null || carBody.isBlank() || carBody.isEmpty()) {
            this.carBody = defalt;
        } else {
            this.carBody = carBody;
        }
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (seatCount <= 0) {
            this.seatCount = 2;
        } else {
            this.seatCount = seatCount;
        }
        if (rubberType == null || rubberType.isBlank() || rubberType.isEmpty()) {
            this.rubberType = defalt;
        } else {
            this.rubberType = rubberType;
        }
    }

    public String showInfo() {
        return super.toString() + " объем двигателя — " + engineVolume + " л. Коробка передач - " + transmission
                + ". Тип кузова - " + carBody + ". Регистрационный номер - " + registrationNumber
                + ". Количество мест - " + seatCount + ". Тип резины " + rubberType + ".";
    }

    @Override
    public void refil() {
        if (getFuelType() == "дизель" || getFuelType() == "бензин") {
            System.out.println("Заправьте " + getFuelType() + " на заправке");
            setFuelPercentage(100f);
        } else {
            System.out.println("Заправьте " + getFuelType() + " на электростанции");
            setFuelPercentage(100f);
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = defalt;
        } else {
            this.transmission = transmission;
        }
    }

    public String getCarBody() {
        return carBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = defalt;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getRubberType() {
        return rubberType;
    }

    public void setRubberType(String rubberType) {
        if (rubberType == null || rubberType.isBlank() || rubberType.isEmpty()) {
            this.rubberType = defalt;
        } else {
            this.rubberType = rubberType;
        }
    }

    public Car changeRubberType(Car car) {
        if (car.getRubberType() == "Зимняя") {
            car.setRubberType("Летняя");
        } else {
            car.setRubberType("Зимняя");
        }
        return car;
    }

    public String checkNumberValid(Car car) {
        String str = "";
        String regex = "^[A-Za-z]{1}[0-9]{3}[A-Za-z]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(car.getRegistrationNumber());
        if (matcher.matches() == true) {
            str += "Номер введен верно";
        } else {
            str += "Номер введен некорректно";
            car.setRegistrationNumber("x000xx000");
        }
        return str;
    }
}


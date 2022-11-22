public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;
    private String flowerName;


    public Flower(String flowerName, String flowerColor, String country, float cost, int lifeSpan) {
        if (flowerName != null || !flowerName.isBlank() || !flowerName.isEmpty()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Цветок";
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost == 0 || cost < 0) {
            this.cost = 1;
        } else {
            double roundOff = Math.round(cost * 100.0) / 100.0;
            this.cost = roundOff;

        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost == 0 || cost < 0) {
            this.cost = 1;
        } else {
            double roundOff = Math.round(cost * 100.0) / 100.0;
            this.cost = roundOff;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public void showInfo() {
        System.out.println(flowerName + ", страна - " + country + ", стоимость штуки - " + cost
                + ", срок стояния - " + lifeSpan);
    }
}

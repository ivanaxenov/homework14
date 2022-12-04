package Animal;

import java.util.Objects;

public class Predator extends Mammal {

    private String foodType;

    public Predator(String petName, int birthDate, String livingEnvironment, String movementSpeed, String foodtype) {
        super(petName, birthDate, livingEnvironment, movementSpeed);
        if (foodType != null && !foodType.isEmpty() && !foodType.isBlank()) {
            this.foodType = foodType;
        } else {
            this.foodType = defult;
        }
    }

    @Override
    public void eat(Animal animal) {
        System.out.println(animal.getAnimalName() + " ест " + foodType);
    }

    @Override
    public void go(Animal animal) {
        System.out.println(animal.getAnimalName() + " охотится");
    }

    public String getFoodType() {
        return foodType;
    }


    @Override
    public String toString() {
        return super.toString() + "Predator{" +
                "foodType='" + foodType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return foodType.equals(predator.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}

package Animal;

import java.util.Objects;

public class Flightless extends Bird {

    private Boolean movementType;

    public Flightless(String petName, int birthDate, String livingEnvironment, String movementType) {
        super(petName, birthDate, livingEnvironment);
        if (movementType == "нелетающая") {
            this.movementType = false;
        }

    }

    @Override
    public void eat(Animal animal) {
        System.out.println(animal.getAnimalName() + " ест");
    }

    @Override
    public void go(Animal animal) {
        System.out.println(animal.getAnimalName() + " гуляет");
    }

    public Boolean getMovementType() {
        return movementType;
    }


    @Override
    public String toString() {
        String movType = "";
        if (movementType == false) {
            movType += "нелетающая";
        }
        return super.toString() + "Flightless{" +
                "movementType=" + movType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return movementType.equals(that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}

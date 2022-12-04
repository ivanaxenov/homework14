package Animal;

import java.util.Objects;

public class Flying extends Bird {

    private Boolean movementType;

    public Flying(String petName, int birthDate, String livingEnvironment, String movementType) {
        super(petName, birthDate, livingEnvironment);
        if (movementType == "летающая") {
            this.movementType = true;
        }
    }

    @Override
    public void eat(Animal animal) {
        System.out.println(animal.getAnimalName() + "  ест");
    }

    @Override
    public void go(Animal animal) {
        System.out.println(animal.getAnimalName() + " летает");
    }

    public Boolean getMovementType() {
        return movementType;
    }


    @Override
    public String toString() {
        String movType = "";
        if (movementType == true && movementType != null) {
            movType += "летающая";
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
        Flying flying = (Flying) o;
        return movementType.equals(flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}

package Animal;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String livingEnvironment;
    private String movementSpeed;

    public Mammal(String petName, int birthDate, String livingEnvironment, String movementSpeed) {
        super(petName, birthDate);
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = defult;
        }
        if (movementSpeed != null && !movementSpeed.isBlank() && !movementSpeed.isEmpty()) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = defult;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "Mammal{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed='" + movementSpeed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return livingEnvironment.equals(mammal.livingEnvironment) && movementSpeed.equals(mammal.movementSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }
}

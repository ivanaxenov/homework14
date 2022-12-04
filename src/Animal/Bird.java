package Animal;

import java.util.Objects;

public abstract class Bird extends Animal {
    private String livingEnvironment;

    public Bird(String petName, int birthDate, String livingEnvironment) {
        super(petName, birthDate);
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = defult;
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

    @Override
    public String toString() {
        return super.toString() + "Bird{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return livingEnvironment.equals(bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}

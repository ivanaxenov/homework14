package Animal;

import java.util.Objects;

public class Amphibian extends Animal {

    private String livingEnvironment;

    public Amphibian(String petName, int birthDate, String livingEnvironment) {
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
    public void eat(Animal animal) {
        System.out.println(animal.getAnimalName() + " ест");
    }

    @Override
    public void go(Animal animal) {
        System.out.println(animal.getAnimalName() + " охотится");
    }

    @Override
    public String toString() {
        return super.toString() + "Amphibian{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return livingEnvironment.equals(amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}

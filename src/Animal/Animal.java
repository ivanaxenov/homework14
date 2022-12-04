package Animal;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animal {
    private String animalName;
    private int birthDate;
    String defult = "defult";

    public Animal(String petName, int birthDate) {
        if (petName != null && !petName.isEmpty() && !petName.isBlank()) {
            this.animalName = petName;
        } else {
            this.animalName = defult;
        }

        if (birthDate > 0) {
            this.birthDate = birthDate;
        } else {
            this.birthDate = 2020;
        }

    }

    public String sleep() {
        return animalName + " спит. ZzzZzzZzz";
    }

    public abstract void eat(Animal animal);

    public abstract void go(Animal animal);

    public String getAnimalName() {
        return animalName;
    }


    public int getAge(int birthDate) {
        return LocalDate.now().getYear() - birthDate;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + getAge(birthDate) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return birthDate == animal.birthDate && animalName.equals(animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, birthDate);
    }
}

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public Human(int yearOfBirth, String name, String town) {
        this(yearOfBirth, name, town, null);
    }

    public void sayHello() {
        System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth
                + " году Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isBlank() && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
}

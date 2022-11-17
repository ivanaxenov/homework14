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
        if (name == null || name == "") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
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
                + " году Я работаю на должности " + jobTitle + ". Будеи знакомы!");
    }
}

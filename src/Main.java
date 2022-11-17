public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(1988, "Максим", "Минкс", "бренд-менеджера");
        Human annya = new Human(1993, "Аня", "Москва", "методиста образовательных программ");
        Human kate = new Human(1992, "Катя", "Калининград", "продакт-менеджера");
        Human artem = new Human(1995, "Артем", "Москва", "директора по развитию бизнеса");
        Human atem = new Human(1995, "Артем", "Москва");
        Human tem = new Human(-1995, "", "", "директора по развитию бизнеса");

        maksim.sayHello();
        annya.sayHello();
        kate.sayHello();
        artem.sayHello();
        atem.sayHello();
        tem.sayHello();

        System.out.println(" ");

        Car lada = new Car("Lada", "Granda", 1.7f, "желтого", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черного", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", 3.0f, "черного", 2021, "Германии");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красного", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевого", 2016, "Южной Корее");
        Car undai = new Car("Hyundai", "", 0, "оранжевого", 2016, "Южной Корее");

        lada.showInfo();
        audi.showInfo();
        bmw.showInfo();
        kia.showInfo();
        hyundai.showInfo();
        undai.showInfo();
    }
}
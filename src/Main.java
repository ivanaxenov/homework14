public class Main {
    public static void printSpace() {
        System.out.println(" ");
    }

    public static Bounquet bouquet1 = new Bounquet(3);

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

        printSpace();
        System.out.println("ООП 2");

        Car lada = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия", "механическая", "седан", "A290NB657", 5, "Летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германии", "автоматическая", "седан", "erg332fu4", 5, "Зимняя");
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германии", "автоматическая", "купе", "", 2, "Летняя");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южной Корее", "автоматическая", "кроссовер", "", 5, "Зимняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южной Корее", "автоматическая", "седан", "", 5, "Летняя");
        Car undai = new Car("Hyundai", "", 0, "оранжевый", 2016, "Южной Корее", "автоматическая", "кроссовер", "", 5, "Зимняя");

        lada.showInfo();
        audi.showInfo();
        bmw.showInfo();
        kia.showInfo();
        hyundai.showInfo();
        undai.showInfo();
        System.out.println("");

        System.out.println("Инкапсуляция");
        Human vladimir = new Human(2001, "Владислав", "Владивосток", null);
        vladimir.sayHello();
        printSpace();
        Flower rose = new Flower("Роза", null, "Голандия", 35.59f, 3);
        Flower kolokolchik = new Flower("Колокольчик", null, "", 15f, 6);
        Flower pion = new Flower("Пион", null, "Англия", 69.9f, 1);
        Flower agava = new Flower("Агава", null, "Америка", 16.6f, 7);

        rose.showInfo();
        kolokolchik.showInfo();
        pion.showInfo();
        agava.showInfo();


        float flowers[] = {3.0f, 5.0f, 1.0f};

        bouquet1.addFlower(rose);
        bouquet1.addFlower(kolokolchik);
        bouquet1.addFlower(agava);
        System.out.println(bouquet1.calcBouqetCost(flowers));
        printSpace();
        hyundai.changeRubberType(hyundai);
        hyundai.showInfo();

        System.out.println(lada.checkNumberValid(lada));
        System.out.println(audi.checkNumberValid(audi));

        Car.Insurance ladaInsurence = lada.new Insurance("2000", 2_019_202d, "1205394032");
        System.out.println(ladaInsurence.checkInsurenseNumber());
        System.out.println();
        System.out.println(ladaInsurence.checkVadilityInsurence(lada));

    }

}

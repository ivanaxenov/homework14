import Animal.*;
import Transport.Bus;
import Transport.Car;
import Transport.Train;


public class Main {
    public static void animalsEquals(Animal animalFirst, Animal animalSecond) {
        if (animalFirst.equals(animalSecond)) {
            System.out.println("Животные не уникальны!");
        } else {
            System.out.println("Животные уникальны!");
        }
    }

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

        Car lada = new Car("Lada", "Granda", 1.7f, "желтый", 2015, "Россия",
                "180", 45.24f, "бензин", "механическая", "седан", "A290NB657", 5, "Летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020,
                "Германии", "240", 11.41f, "бензин", "автоматическая", "седан", "erg332fu4", 5,
                "Зимняя");
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германии",
                "260", 55.34f, "дизель", "автоматическая", "купе", "", 2, "Летняя");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018,
                "Южной Корее", "220", 14.99f, "бензин", "автоматическая", "кроссовер", "", 5,
                "Зимняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016,
                "Южной Корее", "230", 57.74f, "бензин", "автоматическая", "седан", "", 5,
                "Летняя");
        Car yundai = new Car("Hyundai", "", 0, "оранжевый", 2016,
                "Южной Корее", "221", 56.45f, "бензин", "автоматическая", "кроссовер", "",
                5, "Зимняя");

        System.out.println(lada.showInfo());
        System.out.println(audi.showInfo());
        System.out.println(bmw.showInfo());
        System.out.println(kia.showInfo());
        System.out.println(hyundai.showInfo());
        System.out.println(yundai.showInfo());

        printSpace();
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
        printSpace();
        System.out.println("Задание 1");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", "",
                "301", 3500f, 69.41f, "", "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-901", 2019, "Россия", "",
                "270", 1700f, 10.28f, "", "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);

        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());

        Bus bus1 = new Bus("Mersedes-Benz", "Sprinter II", 2006, "Германия", "cерый", "220", 67.45f, "бензин", "Частный");
        Bus bus2 = new Bus("Hyundai", "H350", 2008, "Южная Корея", "черный", "230", 89.45f, "дизель", "Частный");
        Bus bus3 = new Bus("ПАЗ", "3206", 1995, "Россия", "белый", "160", 48.5f, "бензин", "Муниципальный");

        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());
        printSpace();
        System.out.println("Задание 2");

        lada.refil();
        lastochka.refil();
        bus2.refil();

        System.out.println(lada.toString());
        System.out.println(lastochka.toString());
        System.out.println(bus2.toString());

        printSpace();
        System.out.println("Задание 3");

        Herbivore gazel = new Herbivore("Газель", 2018, "Саванна",
                "50", "трава");
        System.out.println(gazel.toString());
        gazel.eat(gazel);
        gazel.go(gazel);
        gazel.sleep();

        Herbivore zhiraf = new Herbivore("Жираф", 2017, "Саванна",
                "55", "трава");
        System.out.println(zhiraf.toString());

        Herbivore loshad = new Herbivore("Лошадь", 2020, "Степь",
                "20", "трава");
        System.out.println(loshad.toString());

        Predator giena = new Predator("Гиена", 2018, "Саванна",
                "60", "мясо");
        System.out.println(giena.toString());

        Predator tigr = new Predator("Тигр", 2016, "Саванна",
                "80", "мясо");
        System.out.println(tigr.toString());

        Predator medved = new Predator("Медведь", 2018, "Тайга",
                "60", "мясо");
        System.out.println(medved.toString());

        Amphibian liagushka = new Amphibian("Лягушка", 2021, "Озеро");
        System.out.println(liagushka.toString());

        Amphibian uzhPresnovodn = new Amphibian("Уж пресноводный", 2020, "Озеро");
        System.out.println(uzhPresnovodn.toString());

        Flightless pavlin = new Flightless("Павлин", 2019, "Тропический лес",
                "нелетающая");
        System.out.println(pavlin.toString());

        Flightless pingvin = new Flightless("Пингвин", 2017, "Антарктика",
                "нелетающая");
        System.out.println(pingvin.toString());

        Flightless ptitsaDodo = new Flightless("Птица Додо", 1985, "Тропический лес",
                "нелетающая");
        System.out.println(ptitsaDodo.toString());

        Flying chaika = new Flying("Чайка", 2021, "Побережье Черного Моря",
                "летающая");
        System.out.println(chaika.toString());

        Flying albatros = new Flying("Альбатрос", 2020, "Побережье Черного Моря",
                "летающая");
        System.out.println(albatros.toString());

        Flying sokol = new Flying("Сокол", 2019, "Степь",
                "летающая");
        System.out.println(sokol.toString());

        animalsEquals(gazel, gazel);
        animalsEquals(pavlin, chaika);

    }

}

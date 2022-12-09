import transport.*;
import zoo.*;

public class Main {

    public static <T> void printCompareAnimals(T animals1, T animals2){
        if(animals1.equals(animals2))
            System.out.println("животные одинаковые");
        else
            System.out.println("животные разные");
    }

    public static void main(String[] args) {
        /*
        Train lastochka = new Train(2011,"Россия", "Ласточка", "B-901",
                "", 301, 3500.0, 4, "Белорусский вокзал", "Минск-Пассажирский", 11);

        Train leningrad = new Train(2019,"Россия", "Ленинград", "D-125",
                "", 270, 3500.0, 4, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());

        Bus firstBus = new Bus(2015, "Россия", "ЛиАЗ", "4292", "Синий", 85);
        Bus secondBus = new Bus(2017, "Россия", "СитиРитм", "5270GH", "Желтый", 85);
        Bus thirdBus = new Bus(2017, "Россия", "НефАЗ", "43101/43114", "Серый", 90);

        System.out.println(firstBus);
        System.out.println(secondBus);
        System.out.println(thirdBus);
        */

        Amphibian frog = new Amphibian("Лягушка",3, "Болото");
        Amphibian grassSnake = new Amphibian("Уж пресноводный",2, "Водоемы");

        Herbivore gazelle = new Herbivore("Газель", 5, "Пустыня", 15, "");
        Herbivore giraffe = new Herbivore("Жираф", 8, "Пустыня", 10, "Листья");
        Herbivore horse = new Herbivore("Лошадь", 9, "Горы", 30, "");

        Predator hyena = new Predator("Гиена", 5, "Пустыня", 30, "");
        Predator tiger = new Predator("Тигр", 10, "Саванна", 30, "");
        Predator bear = new Predator("Гиена", 12, "Лес", 30, "Рыба");

        FlyingBird seagull = new FlyingBird("Чайка", 2, "Миграция", "");
        FlyingBird albatross = new FlyingBird("Альбатрос", 6, "Антарктида", "");
        FlyingBird falcon = new FlyingBird("Павлин", 3, "Америка", "");

        FlightlessBird peacock = new FlightlessBird("Павлин", 3, "Пустыня", "");
        FlightlessBird penguin = new FlightlessBird("Пингвин", 12, "Антарктика", "Плавает");
        FlightlessBird dodoBird = new FlightlessBird("Птица До ДО", 2000, "Пангея", "Вымерание");

        printCompareAnimals(bear, albatross);
        printCompareAnimals(falcon, falcon);

        System.out.println(falcon);
    }
}
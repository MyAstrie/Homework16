package transport;

public class Bus extends Transport{
    private final String[] fuels = {"Бензин", "Дизель"};

    public Bus(Integer productionYear, String productionCountry, String brand, String model, String color, Integer maxSpeed) {
        super(productionYear, productionCountry, brand, model, color, maxSpeed);
    }
    public void refill(String fuel){
        boolean checkRefueling = false;

        for(String i : fuels){
            if (i.equalsIgnoreCase(fuel)) {
                checkRefueling = true;
                break;
            }
        }

        if(checkRefueling){
            System.out.println("Заправка произведена");
        }
        else {
            System.out.println("Данный вид топлива не подходит для заправки");
        }
    }
}

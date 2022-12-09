package zoo;

public class Predator extends Mammal{
    private String foodType;

    public void hunt(){};

    public Predator(String name, Integer years, String area, Integer movementSpeed, String foodType) {
        super(name, years, area, movementSpeed);
        setFoodType(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if(foodType == null || foodType.isEmpty())
            this.foodType = "мясо";
        else
            this.foodType = foodType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Predator{" +
                "foodType='" + foodType + '\'' +
                '}';
    }


}

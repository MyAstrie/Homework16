package zoo;

import java.util.Objects;

public class Herbivore extends Mammal{
    private String foodType;

    public Herbivore(String name, Integer years, String area, Integer movementSpeed, String foodType) {
        super(name, years, area, movementSpeed);
        setFoodType(foodType);
    }

    public void graze(){}

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if(foodType == null || foodType.isEmpty())
            this.foodType = "трава";
        else
            this.foodType = foodType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Herbivore{" +
                "foodType='" + foodType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivore)) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return getFoodType().equals(herbivore.getFoodType()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFoodType());
    }
}

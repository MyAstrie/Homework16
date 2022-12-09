package zoo;

import java.util.Objects;

public abstract class Mammal extends Animal{
    private String area;
    private Integer movementSpeed;

    public Mammal(String name, Integer years, String area, Integer movementSpeed) {
        super(name, years);
        setArea(area);
        setMovementSpeed(movementSpeed);
    }

    private void interpreter(){};

    public String getArea() {
        return area;
    }

    public Integer getMovementSpeed() {
        return movementSpeed;
    }

    public void setArea(String area) {
        if(area != null && !area.isEmpty())
            this.area = area;
    }

    public void setMovementSpeed(Integer movementSpeed) {
        if(movementSpeed != null && movementSpeed > 0)
            this.movementSpeed = movementSpeed;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return getArea().equals(mammal.getArea()) && getMovementSpeed().equals(mammal.getMovementSpeed()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea(), getMovementSpeed());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Mammal{" +
                "area='" + area + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}

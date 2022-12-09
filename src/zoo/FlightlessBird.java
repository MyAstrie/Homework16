package zoo;

import java.util.Objects;

public class FlightlessBird extends Bird{
    private String movementType;

    public void walk(){}

    public FlightlessBird(String name, Integer years, String area, String movementType) {
        super(name, years, area);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if(movementType == null || movementType.isEmpty())
            this.movementType = "ходить";
        else
            this.movementType = movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightlessBird)) return false;
        if (!super.equals(o)) return false;
        FlightlessBird that = (FlightlessBird) o;
        return getMovementType().equals(that.getMovementType()) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }

    @Override
    public String toString() {
        return super.toString() +
                "FlightlessBird{" +
                "movementType='" + movementType + '\'' +
                '}';
    }
}
